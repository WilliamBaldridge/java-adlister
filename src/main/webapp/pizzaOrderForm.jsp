<%--
  Created by IntelliJ IDEA.
  User: williambaldridge
  Date: 4/12/21
  Time: 09:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In"/>
    </jsp:include>
</head>
<body>

<h1>Pizza Order</h1>

<form action="/pizza-order" method="POST">

    <label for="crust">Choose Crust:</label>
    <select id="crust" name="crust">
        <option value="thin-crust">Thin Crust</option>
        <option value="regular">Regular</option>
        <option value="stuffed">Stuffed</option>
        <option value="deep-dish">Deep Dish</option>
    </select>

    <label for="sauce">Choose Sauce:</label>
    <select id="sauce" name="sauce">
        <option value="marinara">Marinara</option>
        <option value="alfredo">Alfredo</option>
        <option value="bbq">BBQ</option>
        <option value="none">None</option>
    </select>

    <label for="size">Choose Size:</label>
    <select id="size" name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
        <option value="extra-large">Extra-large</option>
    </select>

    <fieldset>Select Toppings:
<%--        <legend>Select Toppings:</legend>--%>
        <label for="pepperoni">
            <input id="pepperoni" type="checkbox" name="toppings" value="pepperoni">
            Pepperoni
        </label>
        <label for="chicken">
            <input id="chicken" type="checkbox" name="toppings" value="chicken">
            Chicken
        </label>
        <label for="jalapeno">
            <input id="jalapeno" type="checkbox" name="toppings" value="jalapeno">
            Jalapeno
        </label>
        <label for="spinach">
            <input id="spinach" type="checkbox" name="toppings" value="spinach">
            Spinach
        </label>
    </fieldset>
    <br>

    <div>
        <label for="address">Address:</label>
        <input id="address" type="text" name="address" placeholder="Enter Address">
    </div>
    <br>
    <button>Order Now</button>

</form>


</body>
</html>
