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


@WebServlet("/AddBookServlet")
public class AddBookServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   


	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException,NumberFormatException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		
		String bCode = req.getParameter("barcode");
		String bName = req.getParameter("name");
		String bAuthor = req.getParameter("author");
		int bPrice =Integer.parseInt(req.getParameter("price"));
		int bQty = Integer.parseInt(req.getParameter("quantity"));
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/onlinebookstore";
            Connection con= DriverManager.getConnection(url,"root","Krish@123");
			
			PreparedStatement ps = con.prepareStatement("insert into books(barcode,name,author,price,quantity) values(?,?,?,?,?)");
			ps.setString(1, bCode);
			ps.setString(2, bName);
			ps.setString(3, bAuthor);
			ps.setInt(4, bPrice);
			ps.setInt(5, bQty);
			int k = ps.executeUpdate();
			if(k==1)
			{
				RequestDispatcher rd = req.getRequestDispatcher("AddBook.html");
				rd.include(req, res);
				pw.println("<h2>Book Detail Updated Successfully");
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("AddBook.html");
				pw.println(">Failed to Add Books");
				rd.include(req, res);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}


