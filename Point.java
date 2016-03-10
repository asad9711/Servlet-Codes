

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Point2
 */
@WebServlet("/Point")
public class Point extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {
	  res.setContentType("text/html");
	  PrintWriter pw=res.getWriter();
	 
	  pw.println("<html><body>");
	  String name=req.getParameter("name");
	  String password=req.getParameter("pass");
	  if(name.equals("asad")&&password.equals("123"))
		  pw.println("valid user");
	  
	  else
		  pw.println("invalid user");
	  pw.println(req.getProtocol());
	  pw.println(req.getMethod());
		  pw.println("</body></html>");
  }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
