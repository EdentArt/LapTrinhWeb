package mn.iotstar.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/login", "/dang nhap" })
public class LoginController extends HttpServlet {

	private static final long serialVesionUID = -5660203773190134466L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		// Lấy dữ liệu của tham số từ view
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// Xử lí dữ liệu

		// Trả dữ liệu về view
		PrintWriter out = resp.getWriter();
		out.print(username + ": " + password);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);

		// doGet(req, resp);

		// Lấy dữ liệu của tham số từ view
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// Xử lí dữ liệu

		// Trả dữ liệu về view
		req.setAttribute("uName", username);
		req.setAttribute("pass", password);
		
		//View nhận tham số
		RequestDispatcher rd = req.getRequestDispatcher("/views/home.jsp");
		rd.forward(req, resp);
		
	}

}
