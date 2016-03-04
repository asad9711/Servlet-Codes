

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet1
 */
@WebServlet("/DemoServlet1")
public class DemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    out.println("<html><body>");
    out.println("hello");
    out.println("<br>");
    out.println("Thread name="+Thread.currentThread().getName());
    out.println("</body></html>");
    
   
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
