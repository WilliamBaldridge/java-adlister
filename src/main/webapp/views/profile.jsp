<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Your Profile"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp"/>

<div class="container">
    <h1>Viewing your profile</h1>
</div>

<div>
    <h2>Create Ad</h2>
    <form action="/profile" method="POST">
        <label for="ad-title">Enter Title:</label>
        <input id="ad-title" type="text" name="ad-title" placeholder="Enter ad title">
        <br>
        <label for="ad-description">Enter Description:</label>
        <br>
        <textarea
                id="ad-description"
                name="ad-description"
                placeholder="Enter description"
        ></textarea>
        <br>
        <button>Create New Ad</button>
        <hr>
    </form>
</div>

<div>
    <h3>View All Ads</h3>
    <form action="/profile" method="POST">
        <button id="view-index">View Ads</button>
    </form>
</div>

</body>
</html>
