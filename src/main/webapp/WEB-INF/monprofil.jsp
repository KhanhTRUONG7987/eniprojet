<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="salut, c'est la page de Mon Profil chez Enchères ENI!">
<title>Gestion de mon profil</title>
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
			<h1>Modifier Le Profil</h1>
			<form action="MonProfilServlet" method="post">
				<input type="hidden" name="noUtilisateur"
					value="${model.current.noUtilisateur}"><br>
				Pseudo:${model.current.pseudo}<br> Nom:${model.current.nom}<br>
				Prénom:${model.current.prenom}<br> Email:${model.current.email}<br>
				Téléphone:${model.current.telephone}<br>
				Rue:${model.current.rue}<br> Code
				postal:${model.current.codePostal}<br>
				Ville:${model.current.ville}<br> <input type="reset"
					name="BT_MODIFIER" value="Modifier">
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