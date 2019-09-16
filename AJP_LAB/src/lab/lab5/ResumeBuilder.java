package lab.lab5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResumeBuilder
 */
@WebServlet("/ResumeBuilder")
public class ResumeBuilder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeBuilder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.print("<body style='border: 3px solid black;  width:900px; height:500px'>");
		out.print("<center><h2><b><u>RESUME</u></b></h2></center>");
		out.print("<br>");
		out.print("<h3>Kiran Poojary</b></h3>");
		out.print("Matrushrssssi Nilaya Kerjumane Koravadi");
		out.print("<br>Kumbhashi,Kundapura,Udupi-576259");
		out.print("<br>kiranpoojary483@gmail.com");
		out.print("<br>");
		out.print("<br>");
		out.print("<h3>Career Objective</b></h3>");
		out.print("<div style='border: 1px solid black'");
		out.print("<br>kkkkkk Kumbhashi,Kundapura,Udupi-576259 Kumbhashi,Kundapura,Udupi-576259Kumbhashi,Kundapura,Udupi-576259");
		out.print("</div");
		out.print("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String em = request.getParameter("email");
		String ft = request.getParameter("father");
		String mt = request.getParameter("mother"); */
		PrintWriter out = response.getWriter();
		out.print("<body style='border: 3px solid black;  width:900px; height:500px'>");
		out.print("<center><h2><b><u>RESUME</u></b></h2></center>");
		out.print("<br>");
		out.print("<h3><b>Kiran Poojary</b></h3>");
		out.print("Matrushrssssi Nilaya Kerjumane Koravadi");
		out.print("\nKumbhashi,Kundapura,Udupi-576259");
		out.print("kiranpoojary483@gmail.com");
		out.print("</body>");
		
		
	}

}
