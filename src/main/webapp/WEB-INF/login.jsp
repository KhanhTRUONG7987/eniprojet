<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page de Login</title>
</head>
<p style="color: red">${model.message}</p>
<body>
	<h1>Login</h1>
	<form action="LoginServlet" method="post">
	Identifiant:<input type="text" name="pseudo" value="${model.current.pseudo}"><br><br>
	Mot de passe:<input type="text" name="motDePasse" value="${model.current.motDePasse}"><br><br>
	<input type="submit" name="BT_CONNEXION" value="Connexion">
	<input type="checkbox" name="souvenir"> Se souvenir de moi<br><br>
	<a href="#mdpOublie">Mot de passe oublié</a><br><br>
	<input type="button" name="BT_CREER" value="Créer un compte">
	</form>
</body>
</html>