<%@ page import="java.util.List" %>
<%@ page import="com.example.wsclient.entity.Product" %><%--
  Created by IntelliJ IDEA.
  User: Son
  Date: 08/06/2022
  Time: 9:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%
    List<Product> list = (List<Product>) request.getAttribute("products");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
    <div class="container">
        <h1>List Product</h1>

        <table class="table-cell tab-container">
            <thead>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
            </thead>
            <tbody>
                <tr>
                    <%for (Product product:
                            list) {%>
                    <td><%= product.getName() %> <%= product.getPrice() %></td>
                    <%
                        }
                    %>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
