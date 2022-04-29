package servlets;

import java.io.IOException;




import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.mysql.cj.protocol.Resultset;

import sql.IBookConstants;


@WebServlet("/ViewBookServlet")
public class ViewBookServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/onlinebookstore";
            Connection connection= DriverManager.getConnection(url,"root","Krish@123");
            
			String query="SELECT barcode,name,author,price,quantity FROM books";
			
			Statement stmt=connection.createStatement();
			Resultset rs=(Resultset) stmt.executeQuery(query);
			
			RequestDispatcher rd=req.getRequestDispatcher("ViewBooks.html");
			rd.include(req, res);
			
			
			pw.println("<div class=\"tab\">Books Available In Our Store</div>");
			pw.println("<div class=\"tab\">\r\n" + 
					"		<table>\r\n" + 
					"			<tr>\r\n" + 
					"				\r\n" + 
					"				<th>Book Code</th>\r\n" + 
					"				<th>Book Name</th>\r\n" + 
					"				<th>Book Author</th>\r\n" + 
					"				<th>Book Price</th>\r\n" + 
					"				<th>Quantity</th><br/>\r\n" + 
					"			</tr>");
			
			
			while(((ResultSet) rs).next())
			{
				String bCode = ((ResultSet) rs).getString("barcode");
				String bName = ((ResultSet) rs).getString("name");
				String bAuthor = ((ResultSet) rs).getString("author");
				int bPrice = ((ResultSet) rs).getInt("price");
				int bQty = ((ResultSet) rs).getInt("quantity");
				pw.println("<tr><td>"+bCode+"</td>");
				pw.println("<td>"+bName+"</td>");
				pw.println("<td>"+bAuthor+"</td>");
				pw.println("<td>"+bPrice+"</td>");
				pw.println("<td>"+bQty+"</td></tr>");
			}
			pw.println("</table>\r\n" + 
					"	</div>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


