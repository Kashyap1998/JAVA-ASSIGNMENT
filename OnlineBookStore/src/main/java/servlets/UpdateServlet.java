package servlets;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String price = req.getParameter("price");
		String name=req.getParameter("name");
		try
		{
		   Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/onlinebookstore","root","Krish@123");
			 String sql="UPDATE books SET price= ? WHERE name = ?";
			 PreparedStatement ps=con.prepareStatement(sql);
			 ps.setString(1, price);
			 ps.setString(2,name);
			 
				int k = ps.executeUpdate();
				if (true) {
					pw.println("Books updated Successfully");
				}
				else {
					pw.println("Updation unsuccessful");
				}
		      
		   
		}catch(Exception e) {
			e.printStackTrace();}
			
	}
  
}

