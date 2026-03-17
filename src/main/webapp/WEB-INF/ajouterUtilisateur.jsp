<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter un utilisateur</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Ajouter un utilisateur</h1>
        <form method="post" action="addUser">
            <label>Prénom</label>
            <input type="text" name="prenom" placeholder="Entrez le prénom" required/>
            
            <label>Nom</label>
            <input type="text" name="nom" placeholder="Entrez le nom" required/>
            
            <label>Login</label>
            <input type="text" name="login" placeholder="Entrez le login" required/>
            
            <label>Mot de passe</label>
            <input type="password" name="password" placeholder="Entrez le mot de passe" required/>
            
            <input type="submit" value="Ajouter l'utilisateur"/>
        </form>
    </div>
</body>
</html>