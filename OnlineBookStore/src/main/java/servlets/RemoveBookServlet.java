package servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


 
@WebServlet("/RemoveBookServlet")
public class RemoveBookServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	   
	   
	   PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		
		
		String bkid = req.getParameter("barcode");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        String url="jdbc:mysql://localhost:3307/onlinebookstore";
	        Connection connection=DriverManager.getConnection(url,"root","Krish@123");
	        String sql="DELETE FROM books WHERE barcode=?";
			PreparedStatement ps = connection.prepareStatement(sql);
					
			ps.setString(1, bkid);
			int k = ps.executeUpdate();
			
			
			
			if (k == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("sample.html");
				rd.include(req, res);
				pw.println("Books Removed Successfully");
				} 
			
			else {
				RequestDispatcher rd = req.getRequestDispatcher("sample.html");
				rd.include(req, res);
				pw.println("Books Not Available In The Store");
				}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}


