<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// jsp에서는 request, response가 내장되어 있다.
	// 입력값 : table.jsp?r=10&c=10
	String sRow = request.getParameter( "r" );
	String sCol = request.getParameter( "c" );
	
	int nRow = Integer.parseInt( sRow );
	int nCol = Integer.parseInt( sCol );
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=nRow %>
	<%=nCol %>
	<table border="1px" cellspacing="0" cellpadding="10px">
	<!-- jsp는 아래와 같은 방법으로 어떤 html코드를 java코드를 활용, 반복시키는 등의 일을 하게 한다. -->
		<%
			for( int i=0; i<nRow; i++ ) {
		%>
	
		<tr>
			<%
				for( int j=0; j<nCol; j++ ) {
			%>
			<td>cell(<%=j %>, <%=i %>)</td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>		
	</table>
</body>
</html>