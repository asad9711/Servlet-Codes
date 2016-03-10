

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadMp3
 */
@WebServlet("/DownloadMp3")
public class DownloadMp3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fileName="knaan.mp3";
		ServletOutputStream sos=null;
		BufferedInputStream bis=null;
		sos=response.getOutputStream();
//		String s1=getServletContext().getRealPath("/files/knaan.mp3");
//		String s1="G:\\keplerjava\\Learnserv\\files\\knaan.mp3";
		String s1="C:\\Users\\Asad\\Desktop\\New folder\\fitoor.mp3";
		File doc=new File(s1);
		response.setContentType("audio/mpeg");
		response.addHeader("Content Disposition","attachment;filename="+fileName );
		response.setContentLength((int)doc.length());
		FileInputStream fis=new FileInputStream(doc);
		bis=new BufferedInputStream(fis);
		int readBytes=0;
		while((readBytes=bis.read())!=-1)
		{
			sos.write(readBytes);
		}	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
