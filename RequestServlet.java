

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		((ServletResponse) res).setContentType("text/html");
		out=((ServletResponse) res).getWriter();
		out.println("<html><body>");
		out.println(req.getMethod());
		if(req.getMethod().equals("GET"))
				doGet(req,res);
		else
			doPost(req,res);
		
//	String name=req.getParameter("name");
//		String pass=req.getParameter("pass");
//		if(name.equals("asad")&&pass.equals("123"))
//			out.println("user is valid");
//			
//	    else
//			out.println("not valid");
//		out.println("</body></html>");
		
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(name.equals("asad")&&pass.equals("123"))
			out.println("user is valid from doget");
			
	    else
			out.println("not valid from doget");
		out.println("</body></html>");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		
	}
	

}
