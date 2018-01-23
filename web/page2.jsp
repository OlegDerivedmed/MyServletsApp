<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String val = (String) session.getAttribute("range");
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>ShutdownTimer</title>
    <link rel="stylesheet" href="page2.css">
</head>
<body>
<div class="display-flex">
    <div class="block-wrap">
            <div class="block-container">
                <div class="block__item">
                    Тут будет таймер
                </div>
            </div>
        <form name="myApp1" method="post" id="form1" action="/page2">
            <div class="block-container1">
                <div class="block__inem block__item-lg"><button type="submit" id="button"></button>
                </div>
                <div class="block-container">
                    <div class="block__item block__item-lg">
                        <input class="range" name="range" type="range" min="0" max="100" value="<%=val%>"/>
                    </div>
                </div>
            </div>
        </form>

    </div>
</div>
</body>
</html>