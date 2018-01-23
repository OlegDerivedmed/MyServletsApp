<%@ page import="com.derivedmed.servlets.ReqController1" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 16.11.2017
  Time: 6:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String val = (String) session.getAttribute("range");
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>AutoShutDowner</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
<div class="display-flex">
    <div class="block-wrap">
        <form name="myApp" method="post" id="form" action="/main">
            <div class="block-container">
                <div class="block__item" id="bi1"><input type="text" name="hours" placeholder="h" class="textarea"
                                                         value="3"></div>
                <div class="block__item"><input type="text" name="minutes" placeholder="m" class="textarea" value="0">
                </div>
            </div>
            <div class="block-container">
                <div class="block__item block__item-lg">
                    <button type="submit" id="button"></button>
                </div>
            </div>
            <div class="block-container">
                <div class="block__item block__item-lg">
                <input class="range" name="range" type="range" min="0" max="100" value="<%=val%>"/>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
