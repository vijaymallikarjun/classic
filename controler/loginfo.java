package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.entitycell;

@WebServlet("/login")

public class loginfo extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String q1=req.getParameter("email");
		String q2=req.getParameter("usn");
		
		dbcell db=new dbcell();
		entitycell et=db.find(q1);
		if(et==null)
		{
			resp.getWriter().print("<h1>ivalid email</h1>");
		}
		else
		{
			if(et.getUsn().equals(q2))
			{
				resp.getWriter().print("<h1>login sucess</h1>");
			}
			else
			{
				resp.getWriter().print("<h1>invalid usn</h1>");
			}

		}
		
	}
}
