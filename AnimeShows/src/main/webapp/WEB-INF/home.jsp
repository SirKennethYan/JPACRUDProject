<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Favorite Anime Show's</title>

<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"> -->
<jsp:include page="bootstrapHead.jsp" />

</head>
<body>

	<jsp:include page="navbar.jsp" />

	<div class="container-fluid">
		<h1>Anime List</h1>

		<form action="findById.do" method="GET">
			Find by Id: <input type="text" name="fid" /> <input
				class="btn btn-primary" type="submit" value="Show Film" />
		</form>

		<table class="table table-striped table-hover">
			<tbody>
			<thead>
				<th>ID</th>
				<th>Show</th>
			</thead>
				<c:choose>
					<c:when test="${empty animeshows}">No Animeshows found.</c:when>
					<c:otherwise>
						<c:forEach var="as" items="${animeshows }">
						<tr>
							<td>${as.id }</td>
							<td><a href="show.do?fid=${as.id}"> ${as.name} </a></td>
						</tr>		
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
		
	</div>

	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>