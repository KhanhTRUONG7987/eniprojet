<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nouvelle Vente</title>
</head>
<p>${model.message}</p>
<body>
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
	
	

</body>
</html>