<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="beans.Utilisateur" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des utilisateurs</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Gestion des utilisateurs</h1>
        
        <button class="btn btn-success">
            <a href="addUser">+ Ajouter un utilisateur</a>
        </button>
        
        <h2>Liste des utilisateurs</h2>
        
        <c:choose>
            <c:when test="${empty utilisateurs}">
                <div class="message message-empty">
                    <p>Désolé, la liste des utilisateurs est vide</p>
                </div>
            </c:when>
            <c:otherwise>
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Prénom</th>
                            <th>Nom</th>
                            <th>Login</th>
                            <th>Mot de passe</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="utilisateur" items="${utilisateurs}">
                            <tr>
                                <td>${utilisateur.id}</td>
                                <td>${utilisateur.prenom}</td>
                                <td>${utilisateur.nom}</td>
                                <td>${utilisateur.login}</td>
                                <td>${utilisateur.password}</td>
                                <td>
                                    <a href="updatedUser?id=${utilisateur.id}" class="btn btn-warning">Modifier</a>
                                    <a href="deleteUser?id=${utilisateur.id}" class="btn btn-danger" onclick="return confirm('Êtes-vous sûr de vouloir supprimer cet utilisateur ?')">Supprimer</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>