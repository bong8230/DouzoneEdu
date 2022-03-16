package ex01_;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connUtil.DBConnection;   // DB ?—°ê²? ?œ ?‹¸ë¦¬í‹° 

public class GiftSelect {
	public static void main(String[] args) 
				throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
//		1. ?“œ?¼?´ë¸? ë¡œë“œ
		conn = DBConnection.getConnection();
		
//		2. Connection & Open
							 //driver:@IP:portNumber:SID(or ? „?—­?°?´?„°ë² ì´?Š¤ëª?)   ==> "jdbc:oracle:thin:@localhost:1521:orcl";

//		3. ?‚¬?š© (DML ëª…ë ¹) - select 
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM GIFT");  // ctrl+shift+X
		
		System.out.println("?ƒ?’ˆë²ˆí˜¸\t\t?ƒ?’ˆëª?\t\tìµœì?ê°?\tìµœê³ ê°?");
		
		while (rs.next()) {
			int gno = rs.getInt(1);     
			String gname = rs.getString("gname");  // get?ë£Œí˜•("?•„?“œëª?"); ê¶Œì¥?•¨
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			
			System.out.println(gno+"\t\t"+gname+"\t\t  "+g_s+"\t"+g_e);
		}
		
//		4. ??›ë°˜í™˜(?‹«ê¸?)
		rs.close();		stmt.close();		conn.close();
	}
}
