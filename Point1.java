

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Point1
 */
@WebServlet("/Point1")
public class Point1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
   {
	 res.setContentType("text/html");
	   PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		out.println(req.getProtocol()+"<br>");
		out.println(req.getMethod()+"<br>");
		out.println(req.getContentType()+"<br>");
		out.println(req.getContentLength()+"<br>");
		
		if(name.equals("asad")&&pass.equals("123"))
			out.println("user is valid ");
	    else
			out.println("not valid ");
		 out.println("</body></html>");
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
