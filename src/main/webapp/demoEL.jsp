<%@page import="beans.Utilisateur"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	utilisateurs.add(new Utilisateur(3, "Diop","Assane","assane","passer12"));
%>
</body>
</html>