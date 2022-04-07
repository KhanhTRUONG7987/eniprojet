<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Non Connecté</title>
</head>
<body>
	<form action="AccueilNonConnecteServlet" method="post">
		<h1 style="" :left;">ENI Enchères</h1>
		<a href="http://localhost:8080/eniprojet/LoginServlet"
			value="S'inscrire - Se connecter">S'inscrire - Se connecter</a>
		<h1 style="text-align: center;">Liste enchères</h1>
		<h3 style="text-align: left;">Filtres :</h3>
		<input type="text" id="keyword" name="keyword"
			placeholder="Le nom de l'article contient" required minlength="1"
			maxlength="20" size="20"><br>
		<br> <label for="choix de categorie">Catégorie :</label> <select
			name="Categories" id="Choix de la catégorie">
			<option value="toutes">Toutes</option>
			<option value="1">Informatique</option>
			<option value="2">Ameublement</option>
			<option value="3">Vêtement</option>
			<option value="4">Sport et Loisirs</option>
		</select> <input type="submit" name="BT_RECHERCHER" class="submit"
			value="Rechercher">

	</form>
	<c:forEach items="${lstEncheres}" var="articleVendu">
		<div class="col-5 col-sm-4 col-md-3 col-lg-3 col-xl-3 col-xxl-3">
		 <a href="http://localhost:8080/eniprojet/DetailVenteServlet?num=${articleVendu.noArticle}">${articleVendu.nomArticle}</a>
		<ul>
		<li>Description: ${articleVendu.description}</li>
		<li>Date de Début: ${articleVendu.dateDebutEncheres}</li>
		<li>Mise a prix: ${articleVendu.miseAPrix}</li>
		<li>Date de fin: ${articleVendu.dateFinEncheres}</li>
		<li>Etat: ${articleVendu.etatVente}</li>
		<li>Vendeur: ${articleVendu.utilisateur.pseudo}</li>
		</ul>
		</div>
</c:forEach>
</body>
</html>