<%--
  Created by IntelliJ IDEA.
  User: Naichuan Zhang
  Date: 5/29/2020
  Time: 2:24 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String contextPath = request.getContextPath();
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" +
            request.getServerPort() + contextPath;
%>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>YouKnow 问卷调查</title>
<link rel="stylesheet" href="<%=basePath%>/bootstrap-4.5.0-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=basePath%>/css/ityks.css">
<link rel="stylesheet" href="<%=basePath%>/js/fullcalendar2_7/dist/fullcalendar.css">
<link rel="stylesheet" href="<%=basePath%>/js/fullcalendar2_7/dist/fullcalendar.print.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="<%=basePath%>/bootstrap-4.5.0-dist/js/bootstrap.min.js"></script>
