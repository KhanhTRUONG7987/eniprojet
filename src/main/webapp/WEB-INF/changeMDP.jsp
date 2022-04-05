<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion de la changement de MDP</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<p style="color: red">${model.message}</p>
<body>
	<form action="ChangeMDPServlet" method="post">
		<h1 style="text-align: center;">Mon profil</h1>
		Pseudo:<input type="text" name="pseudo" value="${model.current.pseudo}"><br><br>
		Nom:<input type="text" name="nom" value="${model.current.nom}"><br><br>
		Prénom:<input type="text" name="prenom" value="${model.current.prenom}"><br><br>
		Email:<input type="text" name="email" value="${model.current.email}"><br><br>
		Teléphone:<input type="text" name="telephone" value="${model.current.telephone}"><br><br>
		Rue:<input type="text" name="rue" value="${model.current.rue}"><br><br>
		Code postal:<input type="text" name="codePostal" value="${model.current.codePostal}"><br><br>
		Ville:<input type="text" name="ville" value="${model.current.ville}"><br><br>
		Mot de passe actuel:<input type="text" name="motDePasseActuel" value="${model.current.motDePasse}"><br><br>
		Nouveau mot de passe:<input type="text" name="motDePasseNouveau" value="${model.current.motDePasse}"><br><br>
		Confirmation:<input type="text" name="confirmation" value="${model.current.confirmation}"><br><br>
		<!-- Crédit:<br><br> -->
		<input type="submit" name="BT_ENREGISTRER" value="Enregistrer">
		<input type="submit" name="BT_SUPPRIMER" value="Supprimer mon compte">
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>