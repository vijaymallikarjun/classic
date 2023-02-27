package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.entitycell;



@WebServlet("/fetch")

public class fetchall extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dbcell db=new dbcell();
		List<entitycell> list=db.fetchAll();
		req.setAttribute("data", list);
		RequestDispatcher rd=req.getRequestDispatcher("fetchall.jsp");
		rd.forward(req, resp);
	}

}
