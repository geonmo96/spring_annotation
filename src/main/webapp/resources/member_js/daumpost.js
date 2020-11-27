function daumPost(){
	new daum.Postcode({
		oncomplete: function(data) {
			// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
			// 예제를 참고하여 다양한 활용법을 확인해 보세요.
			// google에 다음 지도 api
			// data라는 변수에 사용자가 선택한 주소값이 들어감
			// 도로명일 경우 R, 지번일 경우 J의 값을 가지고 있음.
			console.log('data.userSelectedType : ' + data.userSelectedType)
			console.log('data.roadAddress : ' + data.roadAddress)
			console.log('data.jibunAddress : ' + data.jibunAddress)
			console.log('data.zonecode(우편번호) : ' + data.zonecode)
			var addr = ""
			if(data.userSelectedType === 'R'){
				addr = data.roadAddress
			} else{
				addr = date.jibunAddress
			}
			document.getElementById('addr1').value = data.zonecode;
			$('#addr2').val(addr)
			$('#addr3').focus()
		}
	}).open();
}
// new daum.Postcode().open() - daum에서 제공하는 우편번호 찾기 창 띄움