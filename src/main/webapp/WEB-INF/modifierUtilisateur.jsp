<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="beans.Utilisateur" %>

<%
    Utilisateur u = (Utilisateur) request.getAttribute("utilisateur");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Modifier utilisateur</title>
</head>
<body>
<h1>Modifier un utilisateur</h1>

<form method="post" action="updatedUser">
    <input type="hidden" name="id" value="${utilisateur.id }" />

    <label>Prénom</label><br>
    <input type="text" name="prenom" value="${utilisateur.prenom }" /><br>

    <label>Nom</label><br>
    <input type="text" name="nom" value="${utilisateur.nom }" /><br>

    <label>Login</label><br>
    <input type="text" name="login" value="${utilisateur.login }" /><br>

    <label>Password</label><br>
    <input type="password" name="password" value="${utilisateur.password }" /><br>

    <input type="submit" value="Modifier" />
</form>

</body>
</html>
