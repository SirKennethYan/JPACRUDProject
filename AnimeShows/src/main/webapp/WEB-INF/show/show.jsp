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
		<h5>${name}(${releaseYear})</h5>
		<h4>Show Details:</h4>
		<p>${seasons }Seasons</p>
		<p>${episodeCount }Episodes</p>
		<blockquote>${description}</blockquote>
	</div>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>