<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion de utilisateur</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<p style="color: red">${model.message}</p>
<body>
<div class="container">
	<header>
	<h1>ENI-Enchères</h1>
	</header>
	<form action="UtilisateurServlet" method="post">
			<h1 style="text-align: center;">Mon profil</h1>
			<div class="row g-3">
			  <div class="col">
			    Pseudo:<input type="text" name="pseudo" value="${model.current.pseudo}" class="form-control">
			  </div>
			  <div class="col">
			    Nom:<input type="text" name="nom" value="${model.current.nom}" class="form-control">
			  </div>
			</div>
			<div class="row g-3">
			  <div class="col">
			    Prénom:<input type="text" name="prenom" value="${model.current.prenom}" class="form-control">
			  </div>
			  <div class="col">
			    Email:<input type="text" name="email" value="${model.current.email}" class="form-control">
			  </div>
			</div>
			<div class="row g-3">
			  <div class="col">
			    Téléphone:<input type="text" name="telephone" value="${model.current.telephone}" class="form-control">
			  </div>
			  <div class="col">
			    Rue:<input type="text" name="rue" value="${model.current.rue}" class="form-control">
			  </div>
			</div>
			<div class="row g-3">
			  <div class="col">
			    Code postal:<input type="text" name="codePostal" value="${model.current.codePostal}" class="form-control">
			  </div>
			  <div class="col">
			    Ville:<input type="text" name="ville" value="${model.current.ville}" class="form-control">
			  </div>
			</div>
			<div class="row g-3">
			  <div class="col">
			    Mot de passe:<input type="text" name="motDePasse" value="${model.current.motDePasse}" class="form-control">
			  </div>
			  <div class="col">
			    Confirmation:<input type="text" name="confirmation" value="${model.current.confirmation}" class="form-control">
			  </div>
			</div>
			<br>
			<br>
			<button type="button" class="btn btn-primary btn-lg" name="BT_CREER" value="Créer">Créer</button>
			<button type="button" class="btn btn-secondary btn-lg" name="BT_ANNULER" value="Annuler">Annuler</button>
		</form>
		<footer>
		</footer>
</div>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>

</html>