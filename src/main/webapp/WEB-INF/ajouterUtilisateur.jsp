<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Utilisateur</h1>
	<form method="post" action="addUser">
		<label>Prenom</label><br/>
		<input type="text" name="prenom"/><br/>
		<label>Nom</label><br/>
		<input type="text" name="nom"/><br/>
		<label>Login</label><br/>
		<input type="text" name="login"/><br/>
		<label>Password</label><br/>
		<input type="password" name="password"/><br/>
		<input type="submit" value="Envoyer"/>
	</form>
</body>
</html>