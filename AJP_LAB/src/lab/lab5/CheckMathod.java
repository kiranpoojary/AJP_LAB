package lab.lab5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckMathod
 */
@WebServlet("/CheckMathod")
public class CheckMathod extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckMathod() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String u = request.getParameter("uid");
		String p = request.getParameter("psw");
		PrintWriter out = response.getWriter();
		if (request.getMethod().equalsIgnoreCase("post")) {
			out.print("<h2>Welcome  You are using Post Method:</h2>" + u);
			out.print("<br>");
			out.print("<h3>User ID :</h3>" + u);
			out.print("<br>");
			out.print("<h3>Password :</h3>" + p);
		}
		else
		{
			out.print("<h2>Welcome  You are using Get Method:</h2>" + u);
			out.print("<br>");
			out.print("<h3>User ID :</h3>" + u);
			out.print("<br>");
			out.print("<h3>Password :</h3>" + p);
			
		}

	}

}
