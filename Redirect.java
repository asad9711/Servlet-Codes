

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

import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class Redirect
 */
@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
	res.setContentType("text/html");
	
PrintWriter pw=res.getWriter();
pw.println("<html><body>");
String query="select * from asad.emp where name like 'q%'";
try{
Class.forName("com.mysql.jdbc.Driver");
pw.println("driver registered");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/asad","root","12345");
Statement s=conn.createStatement();
ResultSet rs=(ResultSet) s.executeQuery(query);
//while(rs.next())
//{
//	pw.println(rs.getString(0));
//}
if(rs.next())
{
	res.sendRedirect("https://www.quora.com/");
	pw.println("redirected");
}
else
{
	res.sendRedirect("https://www.google.co.in/");
	pw.println("redirected");
}
conn.close();
}catch(Exception e){}
pw.println("created");
pw.println("</html></body>");
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
