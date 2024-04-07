package jdbcTestings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=null;
		Statement st=null;
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
		st=con.createStatement();
//		int res = st.executeUpdate("Create table today(id int,name varchar(45),phone int(10) ,primary key(id))");
//		System.out.println(res);
		
//		int result = st.executeUpdate("insert into today values(2,'nitin',1234)");
//		st.executeUpdate("insert into today values(3,'nitin',1234)");
		
		ResultSet result = st.executeQuery("Select * from today");
		
		
		
		
		System.out.println(result);
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+result.getString(2)+result.getString("phone")+result.getDouble(3));
			
		}
//		result.close();
		ResultSet res = st.executeQuery("Select * from today where name ='nitin'");
		while(res.next())
		{
			System.out.println(res.getString(2));
		}
		con.close();
		st.close();
	}
}
