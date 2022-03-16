package ex01_;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connUtil.DBConnection;   // DB ?���? ?��?��리티 

public class GiftSelect {
	public static void main(String[] args) 
				throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
//		1. ?��?��?���? 로드
		conn = DBConnection.getConnection();
		
//		2. Connection & Open
							 //driver:@IP:portNumber:SID(or ?��?��?��?��?��베이?���?)   ==> "jdbc:oracle:thin:@localhost:1521:orcl";

//		3. ?��?�� (DML 명령) - select 
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM GIFT");  // ctrl+shift+X
		
		System.out.println("?��?��번호\t\t?��?���?\t\t최�?�?\t최고�?");
		
		while (rs.next()) {
			int gno = rs.getInt(1);     
			String gname = rs.getString("gname");  // get?��료형("?��?���?"); 권장?��
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			
			System.out.println(gno+"\t\t"+gname+"\t\t  "+g_s+"\t"+g_e);
		}
		
//		4. ?��?��반환(?���?)
		rs.close();		stmt.close();		conn.close();
	}
}
