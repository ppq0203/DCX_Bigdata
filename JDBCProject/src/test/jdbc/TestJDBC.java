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
		
		/** class code
		 * // 1. driver 로딩 -> CLASSPATH에서 찾는다.
		Class.forName("oracle.jdbc.driver.OracleDriver");  
//		Class.forName("com.mysql.jdbc.Driver");
		
		 String url = "";
		 url = "jdbc:oracle:thin:@localhost:1521:XE";
//		 url = "jdbc:mysql://localhost:3306/DBNAME?characterEncoding=utf8&autoReconnect=true";
		String user = "system";
		String password = "admin";
		// 2. 드라이버관리자 등록
		 // 1번을 할 경우 자동 등록
		 // 3. 2번을 통해 접속
		Connection con = DriverManager.getConnection(url, user, password);
		 // 4. 명령문을 생성
		 Statement stmt = con.createStatement(); //Web의 session과 비슷
		 String sql = "select table_name from tabs"; // sql문장
		 sql = "select * from board";
//		 sql = "insert into board(num, name, email, pwd, subject, content, regdate, hit, parent, originalfile)\r\n" + 
//		 		"values ( 1, '홍길동','abc@gmail.com','111','111',' ', to_date('2023-02-10'), 0,  1, '0')";
		// 5. 명령문을 실행
		 // 6. 결과테이블(레코드세트)를 받음
		 ResultSet result = stmt.executeQuery(sql); 
		 // 7. 6번에서 데이터 get
		 String data = "";
		 if (result.next()) {
			//ResultSet에서 getOoo()를 사용할 때 (int) or (Object) : int 인덱스(1번부터 시작), Object 컬럼명
			data = result.getString(1);//result.getString("name");
		} 
		 System.out.println("데이터 베이스 결과 :: " + data);
		 // 8. 6번 종료
		 result.close(); 
		 // 9. 4번 종료
		 stmt.close();
		 // 10. 3번 종료
		 con.close();
		 */
	}

}
