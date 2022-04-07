<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Non Connecté</title>
</head>
<body>
	<%
	String email = (String) session.getAttribute("email");
	if (session != null) {
		out.print("Bienvenue au Enchères.org, " + email);
	} else {
		out.print("Salut, login s.v.p");
	}
	%>
	<h3>
		<a href="LogoutServlet">Log out</a>
	</h3>
	<header>
		<div class="logo">
			<a href="<%=request.getContextPath()%>/AccueilUserConnecteServlet" style="font-size: 40px;">ENI-Enchères</a>
		</div>
		<div class="menu">
			<div>
				<a href="<%=request.getContextPath()%>/DetailVenteServlet">Enchères</a>
				<span class="line">--</span> <a
					href="<%=request.getContextPath()%>/NouvelleVenteServlet">Vendre
					un article</a> <span class="line">--</span> <a
					href="<%=request.getContextPath()%>/MonProfilServlet">Mon
					profil</a> <span class="line">--</span> <a
					href="<%=request.getContextPath()%>/LogoutServlet">Déconnexion</a>
			</div>
		</div>
	</header>
	<main>
		<form action="AccueilNonConnecteServlet" method="post">
			<h1 style="":left;">ENI Enchères</h1>
			<a href="http://localhost:8080/eniprojet/UtilisateurServlet"> <input
				type="submit" name="BT_INSCRIPTION_CONNEXION"
				value="S'inscrire - Se connecter">
			</a>
			<h1 style="text-align: center;">Liste enchères</h1>
			<h3 style="text-align: left;">Filtres :</h3>
			<input type="text" id="name" name="name"
				placeholder="Le nom de l'article contient" required minlength="1"
				maxlength="20" size="20"><br> <br> <label
				for="choix de categorie">Catégorie :</label> <select
				name="Categories" id="Choix de la catégorie">
				<option value="toutes">Toutes</option>
				<option value="informatique">Informatique</option>
				<option value="ameublement">Ameublement</option>
				<option value="vêtement">Vêtement</option>
				<option value="sport&loisirs">Sport et Loisirs</option>
			</select> <input type="submit" name="BT_RECHERCHER" class="submit"
				value="Rechercher">

		</form>
	</main>
	<footer>
			<div>
				<a href="<%=request.getContextPath()%>/AccueilUserConnecteServlet" style="font-size: 20px;">ENI-Enchères</a>
				<span class="line">--</span> <a
					href="<%=request.getContextPath()%>/NouvelleVenteServlet" style="font-size: 20px;">Vendre
					un article</a> <span class="line">--</span> <a
					href="<%=request.getContextPath()%>/DetailVenteServlet" style="font-size: 20px;">Enchères</a>
				<span class="line">--</span> <a
					href="<%=request.getContextPath()%>/MonProfilServlet" style="font-size: 20px;">Mon
					profil</a> <span class="line"></span>
			</div>
			<a style="text-align: center; color: #fefefe;">2022 ENI-Enchères. All Rights Reserved.</a>
		</footer>
</body>
</html>