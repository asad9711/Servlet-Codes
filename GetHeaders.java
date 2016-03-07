

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHeaders
 */
@WebServlet("/GetHeaders")
public class GetHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
		Enumeration e=req.getHeaderNames();
//		String str[]=req.getHeaderNames();
		while(e.hasMoreElements())
		{
			String headerName=(String) e.nextElement();
			pw.println(headerName+"::");
		    pw.println(req.getHeader(headerName));
			pw.println("<br>");
		}
		pw.println(req.getProtocol()+"<br>");
		pw.println(req.getMethod()+"<br>");
		pw.println(req.getContentType()+"<br>");
		pw.println(req.getContentLength()+"<br>");
		pw.println("</html></body>");
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
