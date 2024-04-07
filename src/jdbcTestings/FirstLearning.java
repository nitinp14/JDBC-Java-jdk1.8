package jdbcTestings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class FirstLearning {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=null;
		
	Statement st=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
		System.out.println("connection has been succesfully established");
		st=con.createStatement();
		System.out.println("statement  is ready");
		boolean res = st.execute("insert into demo values(52,'rinku',777)");
		System.out.println(res);
		System.out.println("statement  is ready and executed");
		
		
	}
}
