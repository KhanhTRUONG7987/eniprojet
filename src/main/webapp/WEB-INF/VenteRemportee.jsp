<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enchère Remportée</title>
</head>
<body>
	<h1 style="text-align: center;">Enchère Remportée</h1>
	<input type="hidden" name="noUtilisateur"
		value="${usermodel.current.noUtilisateur}">
	<input type ="hidden" name="noArticle" value="${articlemodel.current.noArticle}">
	<br>
	<br> ${articlemodel.current.nomArticle}
	<br>
	<br> Description : ${articlemodel.current.description}
	<br>
	<br> Meilleure offre : ${encheremodel.current.montantEnchere}
	<br>
	<br> Mise à prix : ${articlemodel.current.miseAPrix}
	<br>
	<br> Retrait : ${retraitmodel.current.rue}
	<br> ${retraitmodel.current.codePostal}
	${retraitmodel.current.ville}
	<br>
	<br> Vendeur : ${usermodel.current.pseudo}
	<br>
	<br> Tel : ${usermodel.current.telephone}


</body>
</html>