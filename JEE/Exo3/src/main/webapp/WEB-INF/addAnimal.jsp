<%@ page import="com.example.exo3.AnimalsObject" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 07/09/2023
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter animaux</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</head>
<body>
    <main class="container">
        <div class="text-bg-dark rounder overflow-hidden col-4 offset-4 p-2 text-center">
            <h2>Forms</h2>
            <hr>
            <form action="form" method="post" >
                <div class="row m-2">
                    <div class="col-4 text-start"><label for="type">Type: </label></div>
                    <div class="col-8"><input type="text" name="type" id="type"></div>
                </div>
                <div class="row m-2">
                    <div class="col-4 text-start"><label for="espece">Espèce: </label></div>
                    <div class="col-8"><input type="text" name="espece" id="espece"></div>
                </div>
                <div class="row m-2">
                    <div class="col-4 text-start"><label for="age">Age: </label></div>
                    <div class="col-8"><input type="number" min="0" max="200" step="1" name="age" id="age"></div>
                </div>
                <div class="row m-2">
                    <div class="col-4 text-start"><label for="nom">Nom: </label></div>
                    <div class="col-8"><input type="text" name="nom" id="nom"></div>
                </div>
                <div class="row m-2">
                    <div class="col-4 text-start"><label for="couleur">Type: </label></div>
                    <div class="col-8"><input type="color" name="couleur" id="couleur"></div>
                </div>
                <hr>
                <button class="btn btn-outline-light"><i class="bi bi-send"></i>Envoyer</button>
            </form>
        </div>
        <div>
            <theader>
                <tr>
                    <th>Type</th>
                    <th>Espèce</th>
                    <th>Age</th>
                    <th>Name</th>
                    <th>Color</th>
                </tr>
            </theader>
            <tbody>
            <% if (!animals.isEmpty()) {%>
            <tr>
                <% for (AnimalsObject animal : animals) {%>
                <td><%= animal.getType() %></td>
                <td><%= animal.getEspece() %></td>
                <td><%= animal.getAge() %></td>
                <td><%= animal.getName() %></td>
                <td><%= animal.getColor() %></td>
                <%}%>
            </tr>

            <%}%>
            </tbody>
        </div>
    </main>

</body>
</html>
