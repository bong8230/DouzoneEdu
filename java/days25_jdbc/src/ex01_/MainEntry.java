package ex01_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) 
				throws  ClassNotFoundException, SQLException {
//		1. ?“œ?¼?´ë¸? ë¡œë“œ
		Class.forName("oracle.jdbc.OracleDriver"); //
		System.out.println("driver load success!!");
		
//		2. Connection & Open
							 //driver:@IP:portNumber:SID(or ? „?—­?°?´?„°ë² ì´?Š¤ëª?)   ==> "jdbc:oracle:thin:@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=C:\\\\app\\\\Oracle\\\\Wallet_kosaDB";
		String uid = "kingsmile";
		String pwd = "xxxxxxAt22cc";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!");
//		3. ?‚¬?š© (DML ëª…ë ¹)
		
//		4. ??›ë°˜í™˜(?‹«ê¸?)
	}
}
