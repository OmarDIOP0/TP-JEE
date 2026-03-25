<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Connexion</title>
    <link rel="stylesheet" href="css/style.css">
    <style>
        .login-wrapper {
            max-width: 400px;
            margin: 80px auto;
        }
        .error-msg {
            background: #fdecea;
            color: #c0392b;
            border: 1px solid #e74c3c;
            padding: 10px 15px;
            margin-bottom: 15px;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="login-wrapper">
            <h1>Connexion</h1>

            <% if (request.getAttribute("erreur") != null) { %>
                <div class="error-msg"><%= request.getAttribute("erreur") %></div>
            <% } %>

            <form method="post" action="login">
                <label>Login</label>
                <input type="text" name="login" placeholder="Entrez votre login" required/>

                <label>Mot de passe</label>
                <input type="password" name="password" placeholder="Entrez votre mot de passe" required/>

                <input type="submit" value="Se connecter"/>
            </form>
        </div>
    </div>
</body>
</html>