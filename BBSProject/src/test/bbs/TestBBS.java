package test.bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * DB를 통한 명령
DDL/DML/DCL
CRUD : 개발자 명령
CREATE -> 테이블 정상적으로 만들어졌는지(몇개 만들었는지) 리턴 :: "1개의 테이블이 생성되었습니다.)
CREATE TABLE BOARD 
(	num	   NUMBER(10)     	NOT NULL,
  	name   	VARCHAR2(256)  	NOT NULL,
  	email   	VARCHAR2(256)  		,
  	pwd	    VARCHAR2(256)  	NOT NULL,
  	subject   	VARCHAR2(256)	NOT NULL,
  	content   	VARCHAR2(2000)    		,
  	regdate   	DATE           	NOT NULL,
  	hit   	NUMBER(10)	NOT NULL,
  	parent   	NUMBER(10)	NOT NULL,
  	originalfile    VARCHAR2(256)	NOT NULL
);

RETRIEVE -> 테이블에 있는 데이터를 가져옴. 데이터가 어떤 형태로 있는지 리턴(ResultSet객체)
select * from board
	where num = 1;

UPDATE -> 테이블이 변경할 경우(테이블에 데이터를 추가/변경/삭제할 경우 테이블 내부가 변경된다는 의미)
				몇개의 값(행, record, rows)이 변경(추가/변경/삭제)되었는지 리턴
insert into board(num, name, email, pwd, subject, content, regdate, hit, parent, originalfile)
values ( 1, '홍길동','abc@gmail.com','111','111',' ', to_date('2023-02-10'), 0,  1, '0');

update board set name = '장길산'  where num=1;

delete from board where num=1;

DELETE -> 테이블을 정상적으로 제거되었는지 리턴
drop table board;

 * 
 * @author Anyware
 *
 */
public class TestBBS {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		 String url = "";
		 url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "c##scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement(); //Web의 session과 같음
		int num = 2;
//		create(num);//(*)
		int i = insertDB(stmt, num );
		 System.out.println("데이터 베이스 결과(insert("+num+")) :: " + i);
		String result = selectDB(stmt, num );
		 System.out.println("데이터 베이스 결과(select("+num+")) :: ");
		for (String column : result.split("\t")) {
			System.out.print("[" + column + "]");
		}System.out.println();
//		updateDB(num);//(*)
//		deleteDB(num);//(*)
//		dropDB(num);//(*)

		 stmt.close();
		 con.close();
	}

	private static String selectDB(Statement stmt, int num) throws ClassNotFoundException, SQLException {
		String sql = "select * from board where num = "+num;
		 ResultSet result = stmt.executeQuery(sql); // select 명령
		 String data = "";
		 while (result.next()) {
			for (int i = 0; i < 10; i++) {
				data += "\t" + result.getString(i+1);
			}System.out.println();
		} 
//		 System.out.println("데이터 베이스 결과(select) :: " + data);
		 result.close();
		return data; 
	}

	private static int insertDB(Statement stmt, int num) throws ClassNotFoundException, SQLException {

			 String sql = ""; // sql문장
			 sql = "insert into board(num, name, email, pwd, subject, content, regdate, hit, parent, originalfile)\r\n" + 
			 		"values ( "+ num +", '홍길동','abc@gmail.com','111','111',' ', to_date('2023-02-10'), 0,  1, '0')";
			 int rs = stmt.executeUpdate(sql); // insert/update/delete 명령
//			 System.out.println("데이터 베이스 결과(insert num="+num+") :: " + rs);
			return rs;
	}

}
