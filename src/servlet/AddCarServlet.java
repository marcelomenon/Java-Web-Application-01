package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CarDAO;
import model.Car;

public class AddCarServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		
		// search the writer
		PrintWriter out = response.getWriter();
		
		// searching the parameters on request
		String brand = request.getParameter("brand");
		String type = request.getParameter("type");
		String year = request.getParameter("year");
		String fuel = request.getParameter("fuel");
		String market = request.getParameter("market");
		
		// create object car
		Car car = new Car();
		car.setBrand(brand);
		car.setType(type);
		car.setYear(year);
		car.setFuel(fuel);
		car.setMarket(market);
		
		// save the data
		CarDAO dao;
		try {
			dao = new CarDAO();
			dao.add(car);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// print the saved data
		out.println("<html>");
		out.println("<body>");
		out.println("Car " + car.getBrand() + " " + car.getType() + " " + car.getYear() + " " + car.getFuel() + " to " + car.getMarket() + " added successful");
		out.println("</body>");
		out.println("</html>");
	}

}
