<%--
  Created by IntelliJ IDEA.
  User: williambaldridge
  Date: 4/13/21
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Index of Products</title>
</head>
<body>

<h1>Products</h1>

<c:forEach items="${ads}" var="ad">

    <div>
        <h3>Ad: ${ad.title}</h3>
        <p>Description ${ad.description}</p>
    </div>

</c:forEach>


</body>
</html>
