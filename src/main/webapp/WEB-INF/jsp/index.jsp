<%@ page contentType="text/html;charset=UTF-8" %>
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
<%--                TODO add items later ... --%>
            </table>
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
