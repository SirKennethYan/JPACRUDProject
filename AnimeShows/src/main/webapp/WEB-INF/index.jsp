<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Boot Film Site</title>

<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"> -->
<jsp:include page="bootstrapHead.jsp"/>

</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container-fluid">
	<h1>Welcome to the Video Store</h1>

	<form action="getFilm.do" method="GET">
		Film ID: <input type="text" name="fid" /> 
		<input class="btn btn-primary" type="submit" value="Show Film" />
	</form>

	<table class="table table-striped table-hover">
		<thead>
			<th>ID</th>
			<th>Title</th>
		</thead>
		<tbody>
			<c:forEach items="${filmsList}" var="film">
			<tr>
				<td>${film.id}</td>
				<td><a href="getFilm.do?fid=${film.id}"> ${film.title} </a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

	
<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>