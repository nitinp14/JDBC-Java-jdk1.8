package jdbcTestings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {
	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			st=con.createStatement();
			int rs = st.executeUpdate("update today set name='bhai' where id =2");
			System.out.println(rs);
		}
		catch(SQLException |ClassNotFoundException e)
		{
		e.printStackTrace();
//			e.getMessage();
		}
		finally
		{
			if(con!=null)
			{
				try {
					con.close();
					System.out.println("connection closed");
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(st!=null)
			{
				try {
					st.close();
					System.out.println("statement closed");
				}
				catch(SQLException i)
				{
					i.printStackTrace();
				}
			}
		}
		
	}
}
