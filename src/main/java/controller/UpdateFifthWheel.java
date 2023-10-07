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
 * Servlet implementation class UpdateFifthWheel
 */
@WebServlet("/updateFifthWheel")
public class UpdateFifthWheel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFifthWheel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FifthWheelHelper helper = new FifthWheelHelper();
		
		String oldName = request.getParameter("oldName");
		String manufacturer = request.getParameter("manufacturer");
		String brand = request.getParameter("brand");
		String model = request.getParameter("model");
		Double rating = Double.valueOf(request.getParameter("rating"));

		FifthWheel fifthWheelToUpdate = helper.searchFifthWheelByName(oldName);
		
		fifthWheelToUpdate.setManufacturer(manufacturer);
		fifthWheelToUpdate.setBrand(brand);
		fifthWheelToUpdate.setModel(model);
		fifthWheelToUpdate.setRating(rating);
		
		helper.update(fifthWheelToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
