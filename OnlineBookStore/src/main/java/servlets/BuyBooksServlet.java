package servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import com.mysql.cj.jdbc.ClientPreparedStatement;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.protocol.Resultset;

import constants.IOnlineBookStoreConstants;
import sql.IBookConstants;


@WebServlet("/BuyBooksServlet")
public class BuyBooksServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	   
	   PrintWriter pw = res.getWriter();
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
				
		rd.include(req, res);
		pw.println("<div class=\"tab hd brown \">Books Available In Our Store</div>");
		pw.println("<div class=\"tab\"><form action=\"ReceiptServlet.java\" method=\"post\">");
		pw.println("<table>\r\n" + 
				"			<tr>\r\n" + 
				"				<th>Books</th>\r\n" + 
				"				<th>Code</th>\r\n" + 
				"				<th>Name</th>\r\n" + 
				"				<th>Author</th>\r\n" + 
				"				<th>Price</th>\r\n" + 
				"				<th>Avail</th>\r\n" + 
				"				<th>Qty</th>\r\n" + 
				"			</tr>");
		int i=0;
		while(((ResultSet) rs).next())
		{
			String bCode = ((ResultSet) rs).getString("barcode");
			String bName = ((ResultSet) rs).getString("name");
			String bAuthor = ((ResultSet) rs).getString("author");
			int bPrice = ((ResultSet) rs).getInt("price");
			int bAvl = ((ResultSet) rs).getInt("quantity");
			i=i+1;
			String n = "checked"+ Integer.toString(i);
			String q = "qty"+Integer.toString(i);
			pw.println("<tr>\r\n" + 
					"				<td>\r\n" + 
					"					<input type=\"checkbox\" name="+n+" value=\"pay\">\r\n" + //Value is made equal to bcode
					"				</td>");
			pw.println("<td>"+bCode+"</td>");
			pw.println("<td>"+bName+"</td>");
			pw.println("<td>"+bAuthor+"</td>");
			pw.println("<td>"+bPrice+"</td>");
			pw.println("<td>"+bAvl+"</td>");
			pw.println("<td><input type=\"text\" name="+q+" value=\"0\" text-align=\"center\"></td></tr>");
			
		}
		pw.println("</table>\r\n" + "<input type=\"submit\" value=\" PAY NOW \">"+"<br/>"+
				"	</form>\r\n" + 
				"	</div>");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}


	}

}
