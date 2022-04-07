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
			<div class="container_main">
				<form action="LoginServlet" method="post">
					<div class="mb-3">
						<label for="inputMail" class="form-label">Identifiant:</label> <input
							type="text" name="email" value="${model.current.email}">
					</div>
					<div class="mb-3">
						<label for="inputPassword1">Mot de passe:</label> <input
							type="text" name="mot_de_passe"
							value="${model.current.motDePasse}">
					</div>
					<div class="mb-3 form-check">
						<input type="checkbox" class="form-check-input" id="seSouvenir">
						<label class="form-check-label" for="exampleCheck1">Se
							souvenir de moi</label>
					</div>
					<button type="submit" id="accueil" name="BT_CONNEXION"
						value="Connexion" class="btn btn-primary">Connexion</button>
				</form>
				<a href="ChangeMDPServlet">Mot de passe oublié</a><br> <a
					href="<%=request.getContextPath()%>/UtilisateurServlet">
					<button type="button" name="BT_CREER" value="Créer un compte"
						class="btn btn-primary">Créer un compte</button>
				</a>
				<c:forEach items="${model.lsUtilisateurs}" var="utilisateur">
					<p>${utilisateur.pseudo}${utilisateur.mot_de_passe}</p>
				</c:forEach>

				<!--Map ENI location-->
				<div class="hotline">
					<div
						style="font-size: 32px; font-weight: bolder; font-style: italic; color: #014982;">
						HOTLINE:<span style="color: blue; font-size: 32px;">0223301850</span>
					</div>
				</div>
				<div id="map" style="width: 500px; height: 500px;">
					<iframe
						src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2667.694598748245!2d-1.6945810841330213!3d48.03892496600537!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x480f2027f4d9d215%3A0x4582518e217d718b!2sEni%20School%20Data%20Processing%20Rennes!5e0!3m2!1svi!2sfr!4v1649330086707!5m2!1svi!2sfr"
						width="1200" height="500" style="border: 0;" allowfullscreen=""
						loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
				</div>
			</div>
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
	</div>
	</div>
</body>
</html>