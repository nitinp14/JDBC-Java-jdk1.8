package jdbcTestings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			st=con.createStatement();
			boolean res = st.execute("delete from today where id=3");
			System.out.println(res);
			
			
		}
		catch(SQLException|ClassNotFoundException b)
		
		{
			b.printStackTrace();
		}
		finally {
			if(con!=null)
			{
				try
				{
					con.close();
					System.out.println("conn closed");
				}
				catch(SQLException e)
				{
					
				}
				
			}
			if(st!=null)
			{
				try {
					st.close();
					System.out.println("st closed");
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
		}
	}
}
