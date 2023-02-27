package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.entitycell;

@WebServlet("/update")

public class updatecell extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String d1=req.getParameter("email");
	String d2=req.getParameter("name");
	
	entitycell dv=new entitycell();
	dv.setEmail(d1);
	dv.setName(d2);
	dbcell db=new dbcell();
	db.UPDATE(d1,d2);
	resp.getWriter().print("<h1>data updated</h1>");
	req.getRequestDispatcher("login.html").include(req, resp);
	
}
}
