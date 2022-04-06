<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nouvelle Vente</title>
</head>
<p>${articlemodel.message}</p>
<body>
	<h1 style="text-align: center;">Nouvelle Vente</h1>
	<input type="hidden" name="noUtilisateur" value="${articlemodel.current.noUtilisateur}"><br><br>
	<form action="">
		Article : <input type="text" name="articleNom"
			value="${articlemodel.current.nomArticle}"> <br> <br>
		Description : <input type="text" name="description"
			value="${articlemodel.current.description}"> <br> <br>
		<label for="categorie-select">Catégorie</label> <select
			name="categorie" id="categorie-select">
			<option value="">-- Choisissez une catégorie --</option>
			<option value="1">01- Informatique</option>
			<option value="2">02- Ameublement</option>
			<option value="3">03- Vêtement</option>
			<option value="4">04- Sport & Loisirs</option>
		</select> <br> <label for="upload-photo-btn">Photo de l'article</label> <input
			type="file" id="upload-photo-btn" name="photo"
			accept="image/png, image/jpeg"> <br> Mise à prix : <input
			class="quantity" id="price_choice" min="5" name="miseAPrix"
			value="${articlemodel.current.miseAPrix}" type="number" step="5">
		<br> <label for="bid-start">Début de l'enchère :</label> <input
			type="date" id="bid-start" name="bid-start"
			value="${articlemodel.current.dateDebutEncheres}"> <br>
		<label for="bid-end">Fin de l'enchère :</label> <input type="date"
			id="bid-end" name="bid-end"
			value="${articlemodel.current.dateFinEncheres}"> <br>
		<fieldset>
			<legend>Retrait</legend>

			<label for="nom">Rue :</label> <input type="text" id="nomRue" name="nomRue"
				class="macss" autofocus required placeholder=""
				title="Saisissez votre adresse"> <br>
			<label for="codePostal">Code postal :</label> <input type="text"
				id="codePostal" name="codePostal" pattern="{5}[1-9]"
				title="Saisissez votre code postal"> <br> <label
				for="ville">Ville :</label> <input type="text" id="ville"
				name="ville" title="Saisissez votre ville">
		</fieldset>

		<br> <br> <input type="submit" name="BT_ENREGISTRER"
			value="Enregistrer"> <input type="reset" name="BT_ANNULER" value="Annuler">
	</form>
</body>
</html>