package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.entitycell;

@WebServlet("/remove")

public class remove extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String f1=req.getParameter("email");
		
		entitycell eg=new entitycell();
		eg.setEmail(f1);
		dbcell db=new dbcell();
		db.remove(f1);
		resp.getWriter().print("<h1>data removed</d1>");
	}

}
