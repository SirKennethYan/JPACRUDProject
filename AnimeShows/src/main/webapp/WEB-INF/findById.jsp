<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Find Anime Show by ID</title>
<jsp:include page="bootstrapHead.jsp" />

</head>
<body class="p-3">

	<form action="findById.do" method="GET">
		<input type="text" name="id" /> <br /> <label for="id">Film
			ID:</label> <input type="submit" value="Submit" /> <br />
	</form>

	<p>${message}</p>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>