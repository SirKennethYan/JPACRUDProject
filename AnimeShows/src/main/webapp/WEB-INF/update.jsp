<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Show</title>
<jsp:include page="bootstrapHead.jsp" />

</head>
<body style="background-color: #33475b">
	<jsp:include page="navbar.jsp" />

	<div class="container-fluid">
		<div style="color: white;">
			<h1>Update Forms</h1>
			<form action="updated.do" method="POST">

				<label for="id">ID</label> <input type="text" name="id" /> <label
					for="name">Name</label> <input type="text" name="name" required />

				<label for="releaseYear">Release Year</label> <input type="text"
					name="releaseYear" required /> <label for="description">Description</label>
				<input type="text" name="description" required /> <label
					for="seasons">Seasons</label> <input type="text" name="seasons"
					required /> <label for="episodeCount">Episode Count</label> <input
					type="text" name="episodeCount" required /> <input
					class="btn btn-dark" type="submit" value="Submit" />
			</form>
		</div>
	</div>
	<br>
</body>
</html>