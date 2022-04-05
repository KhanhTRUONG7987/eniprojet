<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Utilisateur Connecté</title>
</head>
<body>
	<form action="AccueilUserConnecteServlet" method="post">
	<h1 style="text-align": left;">ENI Enchères</h1>
	<a href="http://localhost:8080/eniprojet/AccueilConnecteServlet" value="Enchères">Enchères</a>
	<a href="http://localhost:8080/eniprojet/NouvelleVenteServlet" value="Vendre un article">Vendre un article</a>
	<a href="http://localhost:8080/eniprojet/ProfilServlet" value="Mon profil">Mon profil</a>
	<a href="http://localhost:8080/eniprojet/AccueilNonConnecteServlet" value="Déconnexion">Déconnexion</a>
	<h1 style="text-align: center;">Liste enchères</h1>
	<h3 style="text-align : left;"> Filtres :</h3>
	<input type="text" id="name" name="name" placeholder="Le nom de l'article contient" required minlength="1" maxlength="20" size="20"><br><br>
	<label for="choix de categorie">Catégorie :</label>
	<select name="Categories" id="Choix de la catégorie">
	    <option value="toutes">Toutes</option>
	    <option value="informatique">Informatique</option>
	    <option value="ameublement">Ameublement</option>
	    <option value="vêtement">Vêtement</option>
	    <option value="sport&loisirs">Sport et Loisirs</option>
	</select>
	<input type="submit" name="BT_RECHERCHER" class="submit" value="Rechercher">
	
	</form>
</body>
</html>