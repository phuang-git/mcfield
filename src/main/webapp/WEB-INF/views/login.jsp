<%--
  Created by IntelliJ IDEA.
  User: phuang
  Date: 2015/12/28
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>登录</title>
    <style>.error{color:red;}</style>
</head>
<body>
    <div class="error">${error}</div>
    <form method="post">
        用户名：<input type="text" name="username" value="<shiro:principal/>"><br/>
        密码：<input type="password" name="password"><br/>
        自动登录：<input type="checkbox" name="rememberMe" value="true"><br/>
        <input type="submit" value="登录">
    </form>
</body>
</html>
