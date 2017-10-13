<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>폼 테스트</h1>
	<h2>폼 테스트</h2>
	<h3>폼 테스트</h3>
	<h4>폼 테스트</h4>
	<h5>폼 테스트</h5>
	<h6>폼 테스트</h6>
	<h7>폼 테스트</h7>
	<img src="images/logo.png"/>
	<!--
		1. 절대경로방식
		<a href="/helloweb/index.jsp">메인으로 가기</a>
		
		2. 프로그램으로 절대경로 가져오는 방식 
		<a href="<%=request.getContextPath() %>/index.jsp">메인으로 가기</a>
	-->
	<a href="<%=request.getContextPath() %>/index.jsp">메인으로 가기</a>
	<form method="post" action="/helloweb/join">
		<!-- 사용자에게 안보여줄 데이터 -->
		<input type="hidden" name="type" value="ㅄ"/>
		
		이메일 : <input type="text" name="email" value=""/>		
		<br/><br/>
		
		비밀번호 : <input type="password" name="password" value=""/>
		<br/><br/>
		
		이름 : <input type="text" name="name" value=""/>
		<br/><br/>
		
		<!-- 아래 radio는 name을 동일하게 하지 않으면 각각의 객체가 선택되어 radio가 아닌 check가 된다. -->
		성별 : 
		<input type="radio" name="gender" value="female"/>여
		<input type="radio" name="gender" value="male"/>남
		<br/><br/>
		
		birth-year
		<select name="birth-year">
			<option value="1">1년</option>
			<option value="2">2년</option>
			<option value="3" selected>3년</option>
			<option value="4">4년</option>
			<option value="5">5년</option>		
		</select>
		<br/><br/>
		
		취미 :
		<input type="checkbox" name="hobby" value="reading"/>독서
		<input type="checkbox" name="hobby" value="sleeping"/>잠
		<input type="checkbox" name="hobby" value="game"/>게임
		<input type="checkbox" name="hobby" value="sports"/>운동
		<br/><br/>
		
		자기소개 :
		<textarea rows="10" cold="20" name="self-intro">자기소개</textarea>
		<br/><br/>
		
		<br/><br/>
		<input type="submit" value="가입"/>
	</form>
</body>
</html>