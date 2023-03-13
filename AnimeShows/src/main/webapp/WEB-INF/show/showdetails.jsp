<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Details</title>

<jsp:include page="../bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="../navbar.jsp" />

	<div class="container">

		<h1>${animeshows.name}(${animeshows.releaseYear})</h1>
		<h6>ID: ${animeshows.id}</h6>
		<h4>Show Details:</h4>
		<p>Seasons - ${animeshows.seasons }</p>
		<p>Episodes - ${animeshows.episodeCount }</p>
		<blockquote>"${animeshows.description}"</blockquote>
		<img src="${animeshows.imageURL}" width="150"> <br> <br>
		<div class="btn-group">
			<form method="GET" action="update.do">
				<input type="hidden" name="id" value="${animeshows.id}">
				<button type="submit" class="btn btn-primary mr-2">Update</button>
			</form>
			<form method="POST" action="delete.do">
				<input type="hidden" name="id" value="${animeshows.id}">
				<button type="submit" class="btn btn-danger ml-2">Delete</button>
			</form>
		</div>
		<br>
	</div>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>