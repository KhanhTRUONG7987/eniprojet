<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Utilisateur Connecté</title>
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
	<div id="wrapper">
		<header>
			<div class="logo">
				<a href="<%=request.getContextPath()%>/AccueilUserConnecteServlet"
					style="font-size: 40px;">ENI-Enchères</a>
			</div>
			<div class="menu">
				<div>
					<a href="<%=request.getContextPath()%>/EncherirServlet"
						style="font-size: 23px;">Enchères</a> <span class="line">--</span>
					<a href="<%=request.getContextPath()%>/NouvelleVenteServlet"
						style="font-size: 23px;">Vendre un article</a> <span class="line">--</span>
					<a href="<%=request.getContextPath()%>/MonProfilServlet"
						style="font-size: 23px;">Mon profil</a> <span class="line">--</span>
					<a href="<%=request.getContextPath()%>/LogoutServlet"
						style="font-size: 23px;">Déconnexion</a>
				</div>
			</div>
		</header>
		<form action="AccueilUserConnecteServlet" method="post">
			<h1 style="" :left;">ENI Enchères</h1>
			<a href="http://localhost:8080/eniprojet/AccueilConnecteServlet"
				value="Enchères">Enchères</a> <a
				href="http://localhost:8080/eniprojet/NouvelleVenteServlet"
				value="Vendre un article">Vendre un article</a> <a
				href="http://localhost:8080/eniprojet/ProfilServlet"
				value="Mon profil">Mon profil</a> <a
				href="http://localhost:8080/eniprojet/AccueilNonConnecteServlet"
				value="Déconnexion">Déconnexion</a>
			<h1 style="text-align: center;">Liste enchères</h1>
			<h3 style="text-align: left;">Filtres :</h3>
			<input type="text" id="name" name="name"
				placeholder="Le nom de l'article contient" required minlength="1"
				maxlength="20" size="20"><br>
			<br> <label for="choix de categorie">Catégorie :</label> <select
				name="Categories" id="Choix de la catégorie">
				<option value="toutes">Toutes</option>
				<option value="informatique">Informatique</option>
				<option value="ameublement">Ameublement</option>
				<option value="vêtement">Vêtement</option>
				<option value="sport&loisirs">Sport et Loisirs</option>
			</select> <input type="radio" id="Achats" name="Option d'affichage"
				value="Achats" checked> <label for="Achats">Achats</label>
			<ul>
				<li><input type="checkbox" id="encheres ouvertes"
					name="statut enchere" checked> <label
					for="encheres ouvertes">encheres ouvertes</label></li>
				<li><input type="checkbox" id="encheres en cours"
					name="statut enchere" checked> <label
					for="encheres en cours">encheres en cours</label></li>
				<li><input type="checkbox" id="encheres remportees"
					name="statut enchere" checked> <label
					for="encheres remportees">encheres remportees</label></li>
			</ul>

			<input type="radio" id="mes ventes" name="Option d'affichage"
				value="mes ventes" unchecked> <label for="mes ventes">Mes
				Ventes</label>
			<ul>
				<li><input type="checkbox" id="mes ventes en cours"
					name="statut enchere" checked> <label
					for="mes ventes en cours">mes ventes en cours</label></li>
				<li><input type="checkbox" id="ventes non debutees"
					name="statut enchere" checked> <label
					for="ventes non debutees">ventes non debutees</label></li>
				<li><input type="checkbox" id="ventes terminees"
					name="statut enchere" checked> <label
					for="ventes terminees">ventes terminees</label></li>
			</ul>
			<input type="submit" name="BT_RECHERCHER" class="submit"
				value="Rechercher">

		</form>

		${articleModel.current.lstEncheres}
		<footer>
			<div>
				<a href="<%=request.getContextPath()%>/AccueilUserConnecteServlet"
					style="font-size: 20px;">ENI-Enchères</a> <span class="line">--</span>
				<a href="<%=request.getContextPath()%>/NouvelleVenteServlet"
					style="font-size: 20px;">Vendre un article</a> <span class="line">--</span>
				<a href="<%=request.getContextPath()%>/DetailVenteServlet"
					style="font-size: 20px;">Enchères</a> <span class="line">--</span>
				<a href="<%=request.getContextPath()%>/MonProfilServlet"
					style="font-size: 20px;">Mon profil</a> <span class="line"></span>
			</div>
			<a style="text-align: center; color: #fefefe;">2022 ENI-Enchères.
				All Rights Reserved.</a>
		</footer>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
			crossorigin="anonymous"></script>
	</div>
</body>
</html>