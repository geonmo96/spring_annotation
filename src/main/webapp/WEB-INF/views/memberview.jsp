<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>memberview.jsp</h4>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:forEach var="dto" items="${list }">
		아이디 : ${dto.id }<br>
		이름 :  ${dto.name }
		<hr>
	</c:forEach>
	<a href="index">홈</a>
</body>
</html>