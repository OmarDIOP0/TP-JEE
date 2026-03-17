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
</head>
<body>
<section>
<button><a href="addUser">Ajouter</a></button>
<h2>Liste des Utilisateurs</h2>
<c:choose>
	<c:when test="${empty utilisateurs}">
		    <p>Désolé, la liste des utilisateurs est vide</p>
	</c:when>
	<c:otherwise>
		   <table border="1">
	            <tr>
	                <th>ID</th>
	                <th>Prénom</th>
	                <th>Nom</th>
	                <th>Login</th>
	                <th>Password</th>
	                <th><button>Modifier</button></th>
	                 <th><button>Supprimer</button></th>
	            </tr>
            	<c:forEach var="utilisateur" items = "${utilisateurs }">
            	 <tr>
	                <td>${utilisateur.id }</td>
	                <td>${utilisateur.prenom }</td>
	                <td>${utilisateur.nom }</td>
	                <td>${utilisateur.login }</td>
	                <td>${utilisateur.password }</td>
	                <td>
					    <a href="updatedUser?id=${utilisateur.id }">Modifier</a>
					</td>
					<td>
					 <a href="deleteUser?id=${utilisateur.id }">Supprimer</a>
					 </td>
            	</tr>
            	</c:forEach>
            </table>
	</c:otherwise>
</c:choose>
</section>
</body>
</html>
