package calculator.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class HesapMakinesi
 */
@WebServlet("/HesapMakinesi")
public class HesapMakinesi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HesapMakinesi() {
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
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/form.jsp");

		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		int factor1 = 1;
		int factor2 = 1;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sayi1 = request.getParameter("sayi1");
		String sayi2 = request.getParameter("sayi2");

		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("1.sayi:" + sayi1);
		System.out.println("2.sayi:" + sayi2);
		
		String htmlRespone = "<html><h3>";
		
		htmlRespone += "Username is: " + username + "<br/>";
		htmlRespone += "Password is: " + password + "<br/>";
		
		htmlRespone += "1.sayi: " + sayi1 + "<br/>";
		htmlRespone += "2.sayi: " + sayi2 + "<br/>";
		
		double sayix1 = Double.parseDouble(request.getParameter("sayi1"));
		double sayix2 = Double.parseDouble(request.getParameter("sayi2"));

		String operations[] = request.getParameterValues("operation");

		if (operations != null && operations.length != 0) {
			System.out.println("Kategori 1'de Yapilan Ýslemler: ");
			htmlRespone += "Kategori 1'de Yapilan Ýslemler: ";
			for (int i = 0; i < operations.length; i++) {
				System.out.println("Operation " + i + ": " + operations[i]);
				htmlRespone += "islem: " + operations[i] + "<br/>";
			}

			for (int i = 0; i < operations.length; i++) {
				switch (operations[i].toString()) {
				case "square1":
					double kare1 = Math.sqrt(sayix1);
					System.out.println("1.Sayinin Karekökü: " + kare1);
					htmlRespone += "1.Sayinin Karekökü: " + kare1 + "<br/>";
					break;
				case "square2":
					double kare2 = Math.sqrt(sayix2);
					System.out.println("2.Sayinin Karekökü: " + kare2);
					htmlRespone += "2.Sayinin Karekökü " + kare2 + "<br/>";
					break;
				case "square3":
					double kartop = Math.sqrt(sayix1) + Math.sqrt(sayix2);
					System.out.println("Sayilarin Karekökleri Toplami:" + kartop);
					htmlRespone += "Sayilarin Karekökleri Toplami: " + kartop + "<br/>";
					break;
				case "percent1":
					double yuzde1 = sayix1 / 100;
					System.out.println("1.Sayinin Yuzdesi:" + yuzde1);
					htmlRespone += "1.Sayinin Yuzdesi: " + yuzde1 + "<br/>";
					break;
				case "percent2":
					double yuzde2 = sayix2 / 100;
					System.out.println("2.Sayinin Yuzdesi:" + yuzde2);
					htmlRespone += "2.Sayinin Yuzdesi: " + yuzde2 + "<br/>";
					break;
				}
			}
		}

		String operationss = request.getParameter("operation2");

		if (operationss != null) {
			System.out.println("Kategori 2'de Yapilan Ýslem: " + operationss);
			htmlRespone += "Kategori 2'de Yapilan Ýslem: " + operationss + "<br/>";

			switch (operationss) {
			case "factoriyel1":
				for (int i = 2; i <= sayix1; i++) {
					factor1 = i * factor1;
				}
				System.out.println("1.Sayinin Faktoriyeli:" + factor1);
				htmlRespone += "1.Sayinin Faktoriyeli: " + factor1 + "<br/>";
				break;
			case "factoriyel2":
				for (int i = 2; i <= sayix2; i++) {
					factor2 = i * factor2;
				}
				System.out.println("2.Sayinin Faktoriyeli:" + factor2);
				htmlRespone += "2.Sayinin Faktoriyeli: " + factor2 + "<br/>";
				break;
			}

		}

		String feedback = request.getParameter("feedback");
		System.out.println("Feed back is: " + feedback);
		htmlRespone += "Feedback: " + feedback + "<br/>";
		
		String islemSec = request.getParameter("islemSec");
		System.out.println("Yapilan Ýslem: " + islemSec);
		htmlRespone += "Yapilan Ýslem: " + islemSec + "<br/>";
		
		if (islemSec.equals("addition")) {
			double toplam = 0;
			toplam = sayix1 + sayix2;
			System.out.println("Toplam Sonucu" + toplam);
			htmlRespone += "Toplam Sonucu: " + toplam + "<br/>";
		}
		else if (islemSec.equals("subtraction")) {
			double fark = 0;
			fark = sayix1 - sayix2;
			System.out.println("Fark Sonucu" + fark);
			htmlRespone += "Fark Sonucu: " + fark + "<br/>";
		}
		else if (islemSec.equals("multiplication")) {
			double carp = 0;
			carp = sayix1 * sayix2;
			System.out.println("Carpim Sonucu" + carp);
			htmlRespone += "Carpim Sonucu: " + carp + "<br/>";
		}
		else if (islemSec.equals("division")) {
			double div = 0;
			div = sayix1 / sayix2;
			System.out.println("Bolum Sonucu: " + div);
			htmlRespone += "Bolum Sonucu: " + div + "<br/>";
		}

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		htmlRespone += "</h3></html>";

		// return response
		writer.println(htmlRespone);
	}

}