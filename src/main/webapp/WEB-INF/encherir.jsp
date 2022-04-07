<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enchérir</title>
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
		<h1 style="text-align: center;">Détail de la vente</h1>
		<input type="hidden" name="noUtilisateur"
			value="${usermodel.current.noUtilisateur}"> <input
			type="hidden" nema="noArticle"
			value="${articlemodel.current.noArticle}"> <br> <br>
		${articlemodel.current.nomArticle} <br> <br> Description :
		${articlemodel.current.description} <br> <br> Catégorie :
		${articlemodel.current.noCategorie.libelle} <br> <br>
		Meilleure offre : ${encheremodel.current.montantEnchere} <br> <br>
		Mise à prix : ${articlemodel.current.miseAPrix} <br> <br>
		Fin de l'enchère : ${articlemodel.current.dateFinEncheres} <br> <br>
		Retrait : ${retraitmodel.current.rue} <br>
		${retraitmodel.current.codePostal} ${retraitmodel.current.ville} <br>
		<br> Vendeur : ${usermodel.current.pseudo} <br> <br> Ma
		proposition : <input class="quantity" id="enchere_proposition"
			min="${articlemodel.current.prixVente}" name="enchere_proposition"
			value="${encheremodel.current.montantEnchere}" type="number" step="5">
		<input type="submit" name="BT_ENCHERIR" value="Encherir">
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