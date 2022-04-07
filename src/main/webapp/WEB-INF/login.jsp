<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Ici, page de login d'Encheres.org chez Eni!">
<title>PAGE DE LOGIN</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />

<link
	href="https://fonts.googleapis.com/css2?family=Montserrat&amp;display=swap"
	rel="stylesheet">
</head>
<p style="color: red">${model.message}</p>
<body>
	<h1>Login</h1>
	<form action="LoginServlet" method="post">
	Identifiant:<input type="text" name="pseudo" value="${model.current.pseudo}"><br><br>
	Mot de passe:<input type="text" name="motDePasse" value="${model.current.motDePasse}"><br><br>
	<a href="http://localhost:8080/eniprojet/AccueilConnecteServlet"><input type="submit" name="BT_CONNEXION" value="Connexion"></a>	
	<input type="checkbox" name="souvenir"> Se souvenir de moi<br><br>
	<a href="#mdpOublie">Mot de passe oublié</a><br><br>
	<a href="http://localhost:8080/eniprojet/UtilisateurServlet"><input type="button" name="BT_CREER" value="Créer un compte"></a>	
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>