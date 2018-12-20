package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import validate.Validator;

/**
 * Servlet implementation class addpagein
 */
@WebServlet("/servlet/ResultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResultServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String title, writer, publisher, price,  remarks;
		String[] genre;
		String[] stock;


		title = request.getParameter("title");
		writer = request.getParameter("writer");
		publisher = request.getParameter("publisher");
		price = request.getParameter("price");
		genre = request.getParameterValues("genre");
		stock = request.getParameterValues("stock");
		remarks = request.getParameter("remarks");
		
		if(price == null || price.equals("")) {
			price = "0";
		}

		Validator validator = new Validator();

		validator.requireCheck(title, "É^ÉCÉgÉã");
		validator.minlengthCheck(writer, "íòé“");
		validator.integerCheck(price, "âøäi");
		validator.minusCheck(price, "âøäi");
		validator.genreCheck(genre,"ÉWÉÉÉìÉã");
			
		String str = validator.getMessage();

		if(str.length() >0) {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter(); 
			out.println("<html>");
			out.println("<head>");
			out.println("  <title>èëê–ìoò^ämîFâÊñ </title>");
			out.println("</head>");
			out.println("<body >");
			out.println("<h2><span style=color:#F00;>");
			out.println(str);
			out.println("</span></h2>");
			out.println("</body>");
			out.println("</html>");
		}
		else {
			request.setAttribute("Title",title );
			
			request.getRequestDispatcher("../greeting-in_ok.jsp").forward(request, response);
		}
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
