package ex01_;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connUtil.DBConnection;   // DB ?°κ²? ? ?Έλ¦¬ν° 

public class GiftSelect {
	public static void main(String[] args) 
				throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
//		1. ??Ό?΄λΈ? λ‘λ
		conn = DBConnection.getConnection();
		
//		2. Connection & Open
							 //driver:@IP:portNumber:SID(or ? ?­?°?΄?°λ² μ΄?€λͺ?)   ==> "jdbc:oracle:thin:@localhost:1521:orcl";

//		3. ?¬?© (DML λͺλ Ή) - select 
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM GIFT");  // ctrl+shift+X
		
		System.out.println("??λ²νΈ\t\t??λͺ?\t\tμ΅μ?κ°?\tμ΅κ³ κ°?");
		
		while (rs.next()) {
			int gno = rs.getInt(1);     
			String gname = rs.getString("gname");  // get?λ£ν("??λͺ?"); κΆμ₯?¨
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			
			System.out.println(gno+"\t\t"+gname+"\t\t  "+g_s+"\t"+g_e);
		}
		
//		4. ??λ°ν(?«κΈ?)
		rs.close();		stmt.close();		conn.close();
	}
}
