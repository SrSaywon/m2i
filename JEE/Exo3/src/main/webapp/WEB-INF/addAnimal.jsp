<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 07/09/2023
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="mode" type="java.lang.String" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter animaux</title>
</head>
<body>
    <main>
        <form action="form" method="post">
            <div>
                <label for="type">Type: </label>
                <input type="text" name="type" id="type">
            </div>
            <div>
                <label for="espece">Espèce: </label>
                <input type="text" name="espece" id="espece">
            </div>
            <div>
                <label for="age">Age: </label>
                <input type="number" min="0" max="200" step="1" name="age" id="age">
            </div>
            <div>
                <label for="nom">Nom: </label>
                <input type="text" name="nom" id="nom">
            </div>
            <div>
                <label for="couleur">Type: </label>
                <input type="text" name="couleur" id="couleur">
            </div>
            <hr>
            <button>Envoyer</button>
        </form>
    </main>

</body>
</html>
