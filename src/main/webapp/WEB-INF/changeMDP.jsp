<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="salut, c'est la page de la modification de mot de passe en Encheres.org chez Eni!">
<title>Gestion de la changement de MDP</title>
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
		<main>
			<form action="ChangeMDPServlet" method="post">
				<h1 style="text-align: center;">Update Mon Profil</h1>
				<div class="row g-3">
					<div class="col">
						Pseudo:<input type="text" name="pseudo"
							value="${model.current.pseudo}" class="form-control">
					</div>
					<div class="col">
						Nom:<input type="text" name="nom" value="${model.current.nom}"
							class="form-control">
					</div>
				</div>
				<div class="row g-3">
					<div class="col">
						Prénom:<input type="text" name="prenom"
							value="${model.current.prenom}" class="form-control">
					</div>
					<div class="col">
						Email:<input type="text" name="email"
							value="${model.current.email}" class="form-control">
					</div>
				</div>
				<div class="row g-3">
					<div class="col">
						Teléphone:<input type="text" name="telephone"
							value="${model.current.telephone}" class="form-control">
					</div>
					<div class="col">
						Rue:<input type="text" name="rue" value="${model.current.rue}"
							class="form-control">
					</div>
				</div>
				<div class="row g-3">
					<div class="col">
						Code postal:<input type="text" name="code_postal"
							value="${model.current.codePostal}" class="form-control">
					</div>
					<div class="col">
						Ville:<input type="text" name="ville"
							value="${model.current.ville}" class="form-control">
					</div>
				</div>
				<div class="row g-3">
					<div class="col">
						Mot de passe actuel:<input type="text" name="mot_de_passe"
							value="${model.current.motDePasse}" class="form-control">
					</div>
					<div class="col"></div>
				</div>
				<div class="row g-3">
					<div class="col">
						Nouveau mot de passe:<input type="text" name="motDePasseNouveau"
							value="${model.current.motDePasse}" class="form-control">
					</div>
					<div class="col">
						Confirmation:<input type="text" name="confirmation"
							value="${model.current.confirmation}" class="form-control">
					</div>
				</div>
				<br> <br>
				<!-- Crédit:<br><br> -->
				<button type="submit" name="BT_ENREGISTRER" value="Enregistrer">Enregistrer</button>
				<a href="<%=request.getContextPath()%>/UtilisateurServlet">
					<button type="button" name="BT_SUPPRIMER"
						value="Supprimer mon compte">Supprimer mon compte</button>
				</a>
			</form>
		</main>
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
</body>
</html>