<%--
  Created by IntelliJ IDEA.
  User: Naichuan Zhang
  Date: 5/30/2020
  Time: 4:27 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/head.jsp"%>

    <script type="text/javascript" src="<%=basePath%>/js/login.js?v=0.3"></script>
    <style type="text/css">
        html,body {
            height: 100%;
        }
        .box {
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#6699FF', endColorstr='#6699FF'); /*  IE */
            background-image:linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
            background-image:-o-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
            background-image:-moz-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
            background-image:-webkit-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);
            background-image:-ms-linear-gradient(bottom, #6699FF 0%, #6699FF 100%);

            margin: 0 auto;
            position: relative;
            width: 100%;
            height: 100%;
        }
        .login-box {
            width: 100%;
            max-width:500px;
            height: 400px;
            position: absolute;
            top: 50%;

            margin-top: -200px;
            /*设置负值，为要定位子盒子的一半高度*/

        }
        @media screen and (min-width:500px){
            .login-box {
                left: 50%;
                /*设置负值，为要定位子盒子的一半宽度*/
                margin-left: -250px;
            }
        }

        .form {
            width: 100%;
            max-width:500px;
            height: 275px;
            margin: 25px auto 0px auto;
            padding-top: 25px;
        }
        .login-content {
            height: 300px;
            width: 100%;
            max-width:500px;
            background-color: rgba(255, 250, 2550, .6);
            float: left;
        }

        .input-group {
            margin: 0px 0px 30px 0px !important;
        }
        .form-control,
        .input-group {
            height: 40px;
        }

        .form-group {
            margin-bottom: 0px !important;
        }
        .login-title {
            padding: 20px 10px;
            background-color: rgba(0, 0, 0, .6);
        }
        .login-title h1 {
            margin-top: 10px !important;
        }
        .login-title small {
            color: #fff;
        }

        .link p {
            line-height: 20px;
            margin-top: 30px;
        }
        .btn-sm {
            padding: 8px 24px !important;
            font-size: 16px !important;
        }
    </style>
</head>
<body>
<div class="box">
    <div class="login-box">
        <div class="login-title text-center">
            <h1><small>明日科技问卷调查</small></h1>
        </div>
        <div class="login-content ">
            <div class="form">
                <form id="loginform" action="<%=basePath %>/login/verification.do" method="post">
                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                <input type="text" name="username" class="form-control" placeholder="用户名">
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                <input type="password" name="password" class="form-control" placeholder="密码">
                            </div>
                        </div>
                    </div>
                    <div class="form-group form-actions">
                        <div class="col-xs-4 col-xs-offset-4 ">
                            <button type="submit" class="btn btn-sm btn-info"><span class="glyphicon glyphicon-off"></span> 登录</button>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-6 link">
                            <p class="text-center remove-margin"><small>忘记密码？</small> <a href="javascript:void(0)" ><small>找回</small></a>
                            </p>
                        </div>
                        <div class="col-xs-6 link">
                            <p class="text-center remove-margin"><small>还没注册?</small> <a href="javascript:void(0)" onclick="register()" ><small>注册</small></a>
                            </p>
                        </div>
                    </div>
                </form>
                <div class="msg" style="color: red">
                    <p>${message}</p>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="registerModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
            </div>
            <div class="modal-body" >
                <form id="registerform" action="<%=basePath %>/login/register.do" method="post">
                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                <input type="text" name="username" id="username" class="form-control" placeholder="用户名" maxlength="20" onfocus="$('#usernameInfo').show()" onblur="$('#usernameInfo').hide()" />
                            </div>
                        </div>
                        <div class="well" id="usernameInfo" style="display: none;">
                            提示:用户名长度为6-20位英文或数字！
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                <input type="password" name="password" id="password" class="form-control" placeholder="密码" maxlength="20" onfocus="$('#passwordInfo').show()" onblur="$('#passwordInfo').hide()">
                            </div>
                        </div>
                        <div class="well" id="passwordInfo" style="display: none;">
                            提示:密码长度为6-20位英文或数字！
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                <input type="password" name="repassword" id="repassword" class="form-control" placeholder="重复密码" maxlength="20" onfocus="$('#repasswordInfo').show()" onblur="$('#repasswordInfo').hide()">
                            </div>
                        </div>
                        <div class="well" id="repasswordInfo" style="display: none;">
                            提示:要与上面输入的密码一致哦！
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-tower"></span></span>
                                <input type="text" name="wxname" id="wxname" class="form-control" placeholder="姓名" maxlength="20" onfocus="$('#wxnameInfo').show()" onblur="$('#wxnameInfo').hide()">
                            </div>
                        </div>
                        <div class="well" id="wxnameInfo" style="display: none;">
                            提示:真实姓名哦！
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-12  ">
                            <div class="input-group">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-send"></span></span>
                                <input type="text" name="email" id="email" class="form-control" placeholder="邮箱" maxlength="100" onfocus="$('#emailInfo').show()" onblur="$('#emailInfo').hide()">
                            </div>
                        </div>
                        <div class="well" id="emailInfo" style="display: none;">
                            提示:xxxxx@xx.com,这是找回密码的重要凭证！
                        </div>
                    </div>

                    <div class="form-group form-actions">
                        <div class="col-xs-4 col-xs-offset-4 ">
                            <button type="button" class="btn btn-sm btn-info" onclick="subRegister()"><span class="glyphicon glyphicon-off"></span> 注册</button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    function register() {
        $("#registerModal").css('margin-top', 100).modal()
    }
</script>

</body>
</html>
