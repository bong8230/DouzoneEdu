package ex01.jdbc;

import java.sql.*;

import DBconnutil.DBConnection;

public class MainEntry {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			//SQL���� , HTML�±״� java/jsp/servelt������ ���ڿ� ����Ѵ�.
			String sql = "CREATE TABLE KOSATAB(NAME VARCHAR2(20), AGE NUMBER)";
			System.out.println(sql.toString());
			stmt.executeUpdate(sql);
			
			sql = "insert into kosaTab values('aa',33)";
			int result = stmt.executeUpdate(sql);
			
			sql = "select * from kosaTab";
			rs = stmt.executeQuery(sql);
			
			System.out.println(result + "�� �߰���");
			
			while(rs.next()) {
				System.out.println("name : " + rs.getString(1) );
				System.out.println("age : " + rs.getInt("age") );
			}
			
			sql = "DROP TABLE KOSATAB";
			result = stmt.executeUpdate(sql);
			System.out.println("Drop table : " + result);					
			
		} catch (Exception e) {
			 e.printStackTrace();
		} finally {
			rs.close(); stmt.close(); conn.close();
		}//end try
	}
}
