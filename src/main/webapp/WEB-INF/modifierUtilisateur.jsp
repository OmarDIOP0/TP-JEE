<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="beans.Utilisateur" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Modifier un utilisateur</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Modifier l'utilisateur</h1>
        
        <form method="post" action="updatedUser">
            <input type="hidden" name="id" value="${utilisateur.id}" />
            
            <label>Prénom</label>
            <input type="text" name="prenom" value="${utilisateur.prenom}" required/>
            
            <label>Nom</label>
            <input type="text" name="nom" value="${utilisateur.nom}" required/>
            
            <label>Login</label>
            <input type="text" name="login" value="${utilisateur.login}" required/>
            
            <label>Mot de passe</label>
            <input type="password" name="password" value="${utilisateur.password}" required/>
            
            <input type="submit" value="Mettre à jour" class="btn btn-primary"/>
        </form>
        
        <div style="text-align: center; margin-top: 20px;">
            <a href="list" class="btn btn-success">Retour à la liste</a>
        </div>
    </div>
</body>
</html>