<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="${pageContext.request.contextPath}/resources/member_js/daumpost.js"></script>
<script type="text/javascript">
	function reg(){
		$('#addr1').val(
			$('#addr1').val() + "/" + $('#addr2').val() + "/" +  $('#addr3').val() 		
		)
		fo.submit()
	}
</script>
</head>
<body>
	<h4>insertview.jsp</h4>
	<form action="insert" method="post" id="fo">
		<input type="text" name="id"><br>
		<input type="text" name="name" id="addr1" placeholder="우편번호"><br>
		<input type="button" onclick="daumPost()" value="우편번호 찾기"><br>
		<input type="text" id="addr2" placeholder="주  소"><br>
		<input type="text" id="addr3" placeholder="상세주소"><br>
		<input type="button" value="가입" onclick="reg()">		
	</form>
</body>
</html>