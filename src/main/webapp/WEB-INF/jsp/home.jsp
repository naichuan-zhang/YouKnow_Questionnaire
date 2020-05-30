<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
<head>
    <%@include file="/head.jsp"%>
</head>
<body>

<%@ include file="/navbar.jsp" %>

<div class="container" style="margin-top: 25px; padding-bottom: 50px;">
    <div class="row">
        <div class="col-sm-12 col-md-12 col-lg-12">
            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleControls" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleControls" data-slide-to="1"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img src="<%=basePath%>/photo/focus01.jpg" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="<%=basePath%>/photo/focus02.jpg" class="d-block w-100" alt="...">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
    </div>
</div>

<div class="container" style="padding-bottom: 70px;">
    <div class="row">
        <div  class="col-lg-12 col-md-12 col-sm-12">
            <table class="table table-bordered table-hover">
                <tr class="bg-danger">
                    <th>序号</th>
                    <th>问卷标题</th>
                    <th>创建时间</th>
                    <th>截止时间</th>
                    <th>操作</th>
                </tr>
                <c:choose>
                    <c:when test="${not empty mainList}">
                        <c:forEach items="${mainList}" var="item" varStatus="vs">
                            <tr>
                                <td>${vs.index + 1}</td>
                                <td>${item.mainTitle}</td>
                                <td>
                                    <fmt:parseDate value="${item.mainCreat}" pattern="yyyy-MM-dd HH:mm:ss" var="date" />
                                    <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${date}" />
                                </td>
                                <td>
                                    <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${item.mainEndtime}" />
                                </td>
                                <td class="text-center">
                                    <div class="btn-group">
                                        <a class="btn btn-info" href="#" target="_self">参与投票</a>
                                        <a class="btn btn-success" href="#" target="_self">查看结果</a>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                    </c:when>
                </c:choose>
                <tr>
                    <td colspan="6">
                        ${pageHtml}
                    </td>
                </tr>
            </table>
        </div>
        <div  class="col-lg-12 col-md-12 col-sm-12" style="display: none;">
            <div class="panel panel-success">
                <div class="panel-heading">
                    工作日历
                </div>
                <div class="panel-body">
                    <div id='calendar'></div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container">
    <div class="modal fade" id="alertOK">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button class="close" data-dismiss="modal">
                        <span aria-hidden="true">&times;</span>
                        <span class="sr-only">Close</span>
                    </button>
                </div>
                <div class="modal-body">
                    <p id="alertOKText">您的意见我们已经收到，非常感谢您。</p>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        console.log("haha")
        $(".carousel").carousel({
            interval: 5000,
        })
    })
</script>
<script type="text/javascript" src="<%=basePath%>/bootstrap-4.5.0-dist/js/bootstrap.min.js"></script>

</body>
</html>
