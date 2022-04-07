<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enchérir</title>
</head>
<body>
	<h1 style="text-align: center;">Détail de la vente</h1>
	<input type="hidden" name="noUtilisateur"
		value="${usermodel.current.noUtilisateur}">
	<input type ="hidden" nema="noArticle" value="${articlemodel.current.noArticle}">
	<br>
	<br> ${articlemodel.current.nomArticle}
	<br>
	<br> Description : ${articlemodel.current.description}
	<br>
	<br> Catégorie : ${articlemodel.current.noCategorie.libelle}
	<br>
	<br> Meilleure offre : ${encheremodel.current.montantEnchere}
	<br>
	<br> Mise à prix : ${articlemodel.current.miseAPrix}
	<br>
	<br> Fin de l'enchère : ${articlemodel.current.dateFinEncheres}
	<br>
	<br> Retrait : ${retraitmodel.current.rue}
	<br> ${retraitmodel.current.codePostal}
	${retraitmodel.current.ville}
	<br>
	<br> Vendeur : ${usermodel.current.pseudo}
	<br>
	<br> Ma proposition :
	<input class="quantity" id="enchere_proposition"
		min="${articlemodel.current.prixVente}" name="enchere_proposition"
		value="${encheremodel.current.montantEnchere}" type="number" step="5">
	<input type="submit" name="BT_ENCHERIR" value="Encherir">

</body>
</html>