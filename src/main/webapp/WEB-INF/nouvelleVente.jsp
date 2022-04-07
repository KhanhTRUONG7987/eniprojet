<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="salut, c'est la page de nouvelle ventre chez Ench�res ENI!">
<title>Nouvelle Vente</title>
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
<p>${model.message}</p>
<body>
	<%
	String email = (String) session.getAttribute("email");
	if (session != null) {
		out.print("Bienvenue au Ench�res.org, " + email);
	} else {
		out.print("Salut, login s.v.p");
	}
	%>
	<h3>
		<a href="LogoutServlet">Log out</a>
	</h3>
	<header>
		<div class="logo">
			<a href="<%=request.getContextPath()%>/AccueilUserConnecteServlet" style="font-size: 40px;">ENI-Ench�res</a>
		</div>
		<div class="menu">
			<ul>
				<li><a href="<%=request.getContextPath()%>/DetailVenteServlet">Ench�res</a></li>
				<li><a
					href="<%=request.getContextPath()%>/NouvelleVenteServlet">Vendre
						un article</a></li>
				<li><a href="<%=request.getContextPath()%>/MonProfilServlet">Mon
						profil</a></li>
				<li><a href="<%=request.getContextPath()%>/LogoutServlet">D�connexion</a></li>
			</ul>
		</div>
	</header>
	<h1 style="text-align: center;">Nouvelle Vente</h1>
	Article :
	<input type="text" name="article" value="${model.current.nomArticle}">
	<br>
	<br> Description :
	<input type="text" name="description de l'article"
		value="${model.current.description}">
	<br>
	<br>
	<label for="categorie-select">Cat�gorie</label>
	<select name="categorie" id="categorie-select">
		<option value="">-- Choisissez une cat�gorie --</option>
		<option value="categorie-1">01- Informatique</option>
		<option value="categorie-2">02- Ameublement</option>
		<option value="categorie-3">03- V�tement</option>
		<option value="categorie-4">04- Sport & Loisirs</option>
	</select>
	<label for="upload-photo-btn">Photo de l'article</label>
	<input type="file" id="upload-photo-btn" name="photo"
		accept="image/png, image/jpeg"> Mise � prix :
	<input class="quantity" id="price_choice" min="5"
		name="choix de la mise � prix" value="5" type="number" step="5">

	<label for="bid-start">D�but de l'ench�re :</label>
	<input type="date" id="bid-start" name="bid-start" value="">

	<label for="bid-end">Fin de l'ench�re :</label>
	<input type="date" id="bid-end" name="bid-end" value="">

	<br>
	<br>
	<footer>
			<div>
				<a href="<%=request.getContextPath()%>/AccueilUserConnecteServlet" style="font-size: 20px;">ENI-Ench�res</a>
				<span class="line">--</span> <a
					href="<%=request.getContextPath()%>/NouvelleVenteServlet" style="font-size: 20px;">Vendre
					un article</a> <span class="line">--</span> <a
					href="<%=request.getContextPath()%>/DetailVenteServlet" style="font-size: 20px;">Ench�res</a>
				<span class="line">--</span> <a
					href="<%=request.getContextPath()%>/MonProfilServlet" style="font-size: 20px;">Mon
					profil</a> <span class="line"></span>
			</div>
			<a style="text-align: center; color: #fefefe;">2022 ENI-Ench�res. All Rights Reserved.</a>
		</footer>
</body>
</html>