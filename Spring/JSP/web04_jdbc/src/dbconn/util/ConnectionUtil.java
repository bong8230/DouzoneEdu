package dbconn.util;

import java.io.PrintWriter;
import java.sql.*;

//설정에 DBMS에 따라서 드라이버 로딩 및 Connection 객체 생성
public class ConnectionUtil {
	//사용 빈도가 높다라는 전제( 객체 생성 없이 접근 static )
	// dns = data source name
	
	@SuppressWarnings("finally")
	public static Connection getConnection(String dns) {
		Connection conn = null;		
		try {
			if( dns.equals("oracle") ) {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//DBMS 에러를 찾는데 도움
				DriverManager.setLogWriter(new PrintWriter(System.out));
				
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", 
						"smile", "oracle");
				
			} else if( dns.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
				DriverManager.setLogWriter(new PrintWriter(System.out));
				conn = DriverManager.getConnection(
						"jdbc:mysql://kosa2.iptime.org:50324/chat_db",
						"rok", "1234");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dns, String user, String pwd) {
		Connection conn = null;		
		try {
			if( dns.equals("oracle") ) {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//DBMS 에러를 찾는데 도움
				DriverManager.setLogWriter(new PrintWriter(System.out));
				
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", 
						user, pwd);
				
			} else if( dns.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
				DriverManager.setLogWriter(new PrintWriter(System.out));
				conn = DriverManager.getConnection(
						"jdbc:mysql://kosa2.iptime.org:50324/chat_db",
						user, pwd );
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
}
