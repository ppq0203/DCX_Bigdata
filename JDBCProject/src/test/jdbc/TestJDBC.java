package test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "";
		url = "jdbc:oracle:thin:@localhost:1521:XE";
//		url = "jdbc:mysql://localhost:3306/XE?characterEncoding=utf8&autoReconnect=true";
		String user = "c##scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		
		Statement stmt = con.createStatement();
		String sql = "select table_name from tabs";
//		sql = "insert into board(num, name, email, pwd, subject, content, regdate, hit, parent, originalfile)\r\n" + 
//				"values (2, '둘리','abc.gmail.com','222','222','222',to_date('2023-02-10'),0,1,'0')";
//		stmt.executeQuery(sql);
//		sql = "insert into board(num, name, email, pwd, subject, content, regdate, hit, parent, originalfile)\r\n" + 
//				"values (3, '또치','abc.gmail.com','333','333','333',to_date('2023-02-10'),0,1,'0')";
//		stmt.executeQuery(sql);
		sql = "select * from board";
		ResultSet result = stmt.executeQuery(sql);
		String data = "";
		int size = 0;
		while (result.next())
		{
			size = result.getFetchSize();
			System.out.print("database result :");
			for(int i = 0; i < size; ++i)
			{
				data = result.getString(i+1);
				System.out.print(" " + data);
			}
			System.out.println();
		}
		result.close();
		stmt.close();
		con.close();
	}

}
