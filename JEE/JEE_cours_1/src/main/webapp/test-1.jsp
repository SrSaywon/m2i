<%--
  Commentaire jsp
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/09/2023
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<!--commentaire html classique-->

<%! String prenom = "Albert"; %>
<jsp:useBean id="prenomB" type="java.lang.String" scope="request" />
<jsp:useBean id="prenoms" type="java.util.ArrayList<java.lang.String>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test 1</title>
</head>
<body>
    <main>
        <h1>Test-01</h1>
        <hr>
        <p>
            Merci d'être sur cette page test 01!
        </p>
        <hr>
        <p>
            Le prénom de la personne déclaré depuis mon JSP est <%= prenom %>  !
        </p>
        <p>
            Le prénom de la personne déclaré depuis mon servlet est $ avec {blabla}  !
        </p>
        <p>
            Le prénom de la personne déclaré depuis mon servlet est <%= prenomB.toUpperCase() %>  !
        </p>
    </main>
</body>
</html>
