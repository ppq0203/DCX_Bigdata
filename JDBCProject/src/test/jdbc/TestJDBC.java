package test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "";
		String user = "hr";
		String password = "hr";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		String sql = null;
		
		stmt.executeQuery(sql);
		ResultSet result = stmt.executeQuery(sql);
		String data = "";
		if (result.next())
		{
			data = result.getString(0);
		}
		System.out.println("database result : " + data);
		result.close();
		stmt.close();
		con.close();
	}

}
