<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 08/09/2023
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connection</title>
</head>
<body>
    <main class="container">
        <div class="col-8 offset-2 p-3 rounded text-bg-dark">
            <% if (mode.equals"signIn") {%>
            <h1 class="fw-light">- Connexion -</h1>
            <% } %>
            <% if (mode.equals"signUp") {%>
            <h1 class="fw-light">- Creation de Compte -</h1>
            <% } %>
            <hr>
            <form action="" method="post">
                <div class="mb-3">
                    <label for="username" class="form-label">Username:</label>
                    <input type="text" name="username" id="username" value="<%= user.getUsername() %>" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password:</label>
                    <input type="password" name="password" id="password" value="<%= user.getPassword() %>" class="form-control" required>
                </div>
                <hr>
                <div class="text-end">
                    <a href="<%= mode.equals("signIn") ? "signUp" : "signIn" %>" class="btn btn-outline-info me-2">Switch to <%= !mode.equals("signIn") ? "Sign In" : "Register" %></a>
                    <button class="btn btn-outline-light"><i class="bi bi-send"></i> Submit</button>
                </div>
            </form>
        </div>
</body>
</html>
