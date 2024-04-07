package jdbcTestings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedStatementEg {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver has loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			System.out.println("connection is done");
			ps=con.prepareStatement("insert into today values(?,?,?)");
			ps.setInt(1, 7);
			ps.setString(2, "bittu");
			ps.setInt(3, 9999);
			ps.executeUpdate();
			System.out.println("exup done");
			
			ps.setInt(1, 8);
			ps.setString(2,"nihal");
			ps.setInt(3, 3698);
			ps.execute();
			System.out.println("ex done");
			
			con.close();
			ps.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	
	}
}
