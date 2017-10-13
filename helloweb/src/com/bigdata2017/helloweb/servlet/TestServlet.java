package com.bigdata2017.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String sRow = request.getParameter("r");
//		String sCol = request.getParameter("c");
//		
//		int nRow = Integer.parseInt( sRow );
//		int nCol = Integer.parseInt( sCol );
		
		response.setContentType( "text/html; charset=utf-8" );
		PrintWriter out = response.getWriter();
		out.println("test");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
