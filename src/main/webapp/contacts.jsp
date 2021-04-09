<%@ page import="model.Contact" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Contacts</title>
</head>
<body>

<h1>Contacts</h1>

<div>
    <table style="width: 100%; border: 2px solid black">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Active</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="contact" items="${contacts}">
            <c:if test="${contact.isActive}">
                <tr>
                    <td>${contact.id}</td>
                    <td>${contact.name}</td>
                    <td>${contact.email}</td>
                    <td>${contact.address}</td>
                    <td>${contact.phoneNumber}</td>
                    <td>${contact.isActive}</td>
                </tr>
            </c:if>
        </c:forEach>
        </tbody>
    </table>
</div>


</body>
</html>
