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
 * Servlet implementation class DeleteFifthWheel
 */
@WebServlet("/deleteFifthWheel")
public class DeleteFifthWheel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteFifthWheel() {
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
		FifthWheelHelper helper = new FifthWheelHelper();

		String modelName = request.getParameter("modelName");

		FifthWheel deleteable = helper.searchFifthWheelByName(modelName);

		helper.delete(deleteable);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
