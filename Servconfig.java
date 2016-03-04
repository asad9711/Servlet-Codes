

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servconfig
 */
@WebServlet("/Servconfig")
public class Servconfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ServletConfig con;
    public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
    {
     con=getServletConfig();
     res.setContentType("text/html");
     String dr=con.getInitParameter("driver");
     String img=con.getInitParameter("image");
     PrintWriter out=res.getWriter();
//     out.println("<html><body  background= '"+img+"'>");
     out.println("<html><body  background=tweeter1.jpg>");
     out.println(dr);
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
