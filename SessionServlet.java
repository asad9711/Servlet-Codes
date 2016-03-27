

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		try{
			String name=req.getParameter("name");
			String pass=req.getParameter("pass");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver registered");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/asad","root","12345");
		    Statement s=conn.createStatement();
		    String s1="select * from emp where name='"+name+"'and pass='"+pass+"'";
		    ResultSet rs=(ResultSet) s.executeQuery(s1);
		    if(rs.next()){
		    	HttpSession session=req.getSession();
		    	session.setAttribute("name",name);
		    	session.setAttribute("pass",pass);
		    	out.println("user valid"+"  "+"session is"+session.isNew()+"<br>");
		    	out.println("name is "+name+"pass is "+pass);
		    	out.println("<a href='MidServlet'>"+"MidServlet"+"</a><br>");
//		    	out.println("<a href='LogoutServlet'>"+"Logout"+"</a>");
		    }
		}catch(Exception e)
		{
			e.printStackTrace();
		    }
		
	}

}
