

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Newservlet
 */
@WebServlet("/Newservlet")
public class Newservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
	   res.setContentType("text/html");
	   PrintWriter out=res.getWriter();
	   out.println("<html><body>");
	   String method=req.getMethod();
	   out.println(method+ " from newservlet");
	   if(method.equals("GET"))
		   doGet(req,res);
	   else
		   doPost(req,res);
			   
	   
   }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try{
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver registered");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/asad","root","12345");
		    Statement s=conn.createStatement();
		    System.out.println(name+"   "+pass);
//		   String s1="Asd",s2="rew";
		    String sql="INSERT INTO asad.emp(name,pass)"+" values('"+name+"','"+pass+"')";
//		    String sql="INSERT INTO asad.emp(name,pass)"+" values(?,?)";
		    System.out.println("crossed query");
//		    PreparedStatement pstmt = conn.prepareStatement(sql);
//		    pstmt.setString(1,name);
//		    pstmt.setString(2,pass);
//		  int x=pstmt.executeUpdate(sql);
//		    int x=s.executeUpdate(sql);
		    s.executeUpdate(sql);
		  System.out.println("executed");
//		 conn.close();
		     
		}catch(SQLException |ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
