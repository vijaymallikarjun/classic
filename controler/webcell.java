package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.entitycell;

@WebServlet("/Signin")

public class webcell  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		entitycell ec=new entitycell();
		ec.setEmail(req.getParameter("email"));
		ec.setCollage(req.getParameter("collage"));
		ec.setName(req.getParameter("name"));
		ec.setNumber(req.getParameter("number"));
		ec.setUsn(req.getParameter("usn"));
		dbcell dc=new dbcell();
		dc.send(ec);
		resp.getWriter().print("<h1>signin sucess</h1>");
		req.getRequestDispatcher("login.html").include(req, resp);
	}

}
