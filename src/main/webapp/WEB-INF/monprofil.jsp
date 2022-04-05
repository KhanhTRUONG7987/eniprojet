<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion de mon profil</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<p style="color: red">${model.message}</p>
<body>
	<h1>Mon Profil</h1>
	<form action="MonProfilServlet" method="post">
	<input type="hidden" name="noUtilisateur" value="${model.current.noUtilisateur}"><br><br>
	Pseudo:${model.current.pseudo}<br><br>
	Nom:${model.current.nom}<br><br>
	Prénom:${model.current.prenom}<br><br>
	Email:${model.current.email}<br><br>
	Téléphone:${model.current.telephone}<br><br>
	Rue:${model.current.rue}<br><br>
	Code postal:${model.current.codePostal}<br><br>
	Ville:${model.current.ville}<br><br>
	<input type="reset" name="BT_MODIFIER" value="Modifier">
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>