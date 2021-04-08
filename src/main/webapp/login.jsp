<%--
  Created by IntelliJ IDEA.
  User: williambaldridge
  Date: 4/8/21
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    if (request.getMethod().equalsIgnoreCase("POST")) {
        //do parameters exist?
        //if so, if username is "admin"
        // and pw is "password", redirect to profile.jsp
        // otherwise, redirect back to login.jsp

        String username = (request.getParameter("username") != null) ? request.getParameter("username") : "";
        String password = (request.getParameter("password") != null) ? request.getParameter("password") : "";

        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {

            response.sendRedirect("/profile.jsp");
        } else {

            response.sendRedirect("/login.jsp");
        }

    }





%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<h1>Login Page</h1>
<form action="/login.jsp" method="POST">
    <label for="username"></label>
    <input id="username" type="text" name="username" placeholder="Enter username">
    <label for="password"></label>
    <input id="password" type="password" name="password" placeholder="Enter username">
    <button>Login</button>
</form>

</body>
</html>
