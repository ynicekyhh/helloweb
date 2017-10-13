package com.bigdata2017.helloweb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sc")
public class SetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("mycookie", "hello cookie");
		
		/* 보안때문에 크로스 도메인은 안됨? */
		cookie.setPath( "/helloweb" );
		cookie.setMaxAge( 1 * 24 * 60 * 60 );	//초단위로 쿠키를 구움
		
		response.addCookie(cookie);
		
		response.getWriter().println("Baking Cookie");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
