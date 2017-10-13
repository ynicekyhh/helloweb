package com.bigdata2017.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sRow = request.getParameter("r");
		String sCol = request.getParameter("c");
		
		int nRow = Integer.parseInt( sRow );
		int nCol = Integer.parseInt( sCol );
		
		response.setContentType( "text/html; charset=utf-8" );
		PrintWriter out = response.getWriter();
		
		out.println( "<table border='1px' cellspacing='0' cellpadding='10px'>");
		for( int i=0; i < nRow; i++ ) {
			out.println( "<tr>" );
				for(int j=0; j<nCol; j++ ) {
					out.println("<td>Cell(" + j + ", " + i + ")</td>" );
				}
			out.println( "</tr>" );
		}
		out.println( "</table>" );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
