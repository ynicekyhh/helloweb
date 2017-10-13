package com.bigdata2017.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post방식으로 데이터를 전달 받는 경우 인코딩 필수(한글일 경우)
		// encoding charset을 지정
		request.setCharacterEncoding("utf-8");
		
		String email = request.getParameter( "email" );
		System.out.println(email);
		
		String password = request.getParameter( "password" );
		System.out.println(password);

		String name = request.getParameter( "name" );
		System.out.println(name);
		
		String gender = request.getParameter( "gender" );
		System.out.println(gender);
		
		String birthYear = request.getParameter( "birthYear" );
		System.out.println(birthYear);
		
		String[] hobbies = request.getParameterValues( "hobby" );
		if( hobbies != null ) {
			for( String hobby : hobbies ) {
				System.out.println( hobby );
			}
		}
		
		String selfIntro = request.getParameter( "selfIntro" );
		System.out.println(selfIntro);
		
		String hidden = request.getParameter( "type" );
		System.out.println(hidden);
		
		// 응답
		// charset 설정은 outstream보내기 전에 하지 않으면 깨짐
		response.setContentType( "text/html; charset=utf-8" );
		PrintWriter out = response.getWriter();	// "\n"
		out.println("<h1>" + name + "님이 가입하셨습니다.</h1>");
		out.println( "<h1>성공적으로 가입되었습니다.</h1>" );
		out.print( "<a href='/helloweb/form.jsp'>돌아가기</a>" );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//tomcat의 server.xml에서 URIEncoding="UTF-8"로 설정해 놓으면 charset때문에 문제가 될 일은 없다.
		doGet(request, response);
	}

}
