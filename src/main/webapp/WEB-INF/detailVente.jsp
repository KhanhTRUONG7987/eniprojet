<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion de la détail de la vente</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<p style="color: red">${model.message}</p>
<body>

	<!-- <header>
	<h1>ENI-Enchères</h1>
	</header> -->
	
	
	<form action="DetailVenteServlet" method="post">
		<h1 style="text-align: center;">Détail vente</h1>
		<div class="left">
			<img alt="PC Gamer pour travailler" src="/image/pcGamer.jpg">
		</div>
		<div class="center">
			<input type="text" name="nomArticle" value="${model.current.nomArticle}"><br><br>
			Description:<input type="text" name="description" value="${model.current.description}"><br><br>
			Catégorie:<input type="text" name="categorie" value="${model.current.}"><br><br>
			<input type="text" name="BT_ENCHERIR" value="Enchérir">
		</div>
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>

</html>