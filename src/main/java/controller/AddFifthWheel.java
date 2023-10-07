/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Sep 24, 2023
 */

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FifthWheel;

/**
 * Servlet implementation class AddFifthWheel
 */
@WebServlet("/addFifthWheel")
public class AddFifthWheel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFifthWheel() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		FifthWheel f = new FifthWheel();

		FifthWheelHelper helper = new FifthWheelHelper();

		f.setManufacturer(request.getParameter("manufacturer"));
		f.setBrand(request.getParameter("brand"));
		f.setModel(request.getParameter("model"));
		f.setRating(Double.valueOf(request.getParameter("rating")));

		helper.persist(f);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
