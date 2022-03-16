package ex02.mvc;

import java.sql.*;
import java.util.Scanner;

import DBconnutil.DBConnection;

public class GiftController {
	
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstm = null;
	
	//connect
	public static void connect() throws SQLException {
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		conn.setAutoCommit(false);//�ڵ� Ŀ�� ����
		
	}
	
	//close
	public static void close() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void menu() throws SQLException{
		Gift gift = new Gift();
		while(true) {
			System.out.println("\t 0.rollback");
			DBConnection.menu();
			
			switch(sc.nextInt()) {
			case 0:
				System.out.println("Commit �Ͻðڽ��ϱ�??(Y/N)");
				System.out.println("���ϽŴٸ� Rollback �˴ϴ�.");
				if(sc.next().equalsIgnoreCase("Y")) {
					commit();
					selectAll(gift.ClassName);
				} else {
					rollback();
					selectAll(gift.ClassName);
				}
				break;
			case 1:
				selectAll(gift.getClassName());
				insert();
				selectAll(gift.getClassName());
				break;
				
			case 2:
				System.out.println("1. ��ü����");
				System.out.println("2. �κм���");
				switch(sc.nextInt()) {
				case 1:
					updateAll(gift.ClassName);
					break;
				case 2:
					updatePart(gift.ClassName);
					break;
				}
				
				selectAll(gift.getClassName());
				break;
			case 3:
				selectAll(gift.ClassName);
				break;
			case 4:
				selectIf(gift.ClassName);
				break;
			case 5:
				delete(gift.ClassName);
				selectAll(gift.ClassName);
				break;
			case 6:
				close();
				System.out.println("���α׷� ����");
				System.exit(0);
			}//end switch
		}//end while
	}
	

	

	private static void delete(String ClassName) throws SQLException {
		pstm = conn.prepareStatement("delete from " + ClassName + " where gno=?" );
		System.out.println("������ �� ��ȣ : "); String gno = sc.next();
		pstm.setString(1, gno);
		pstm.executeUpdate();
	}

	private static void selectIf(String ClassName) throws SQLException {
		pstm = conn.prepareStatement("select * from " + ClassName + " where gno=?" );
		System.out.println("�� ��ȣ : "); String gno = sc.next();
		pstm.setString(1, gno);
		
		rs = pstm.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		
		while(rs.next()) {
			for (int i = 1; i <= count; i++) {
				switch(rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getFloat(i) + " ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getDate(i) + " ");					
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getString(i) + " ");					
					break;
				}//end switch
			}//end for
			System.out.println();
		}//end while
	}

	private static void updateAll(String ClassName) throws SQLException {
		
		try {
			pstm = conn.prepareStatement("UPDATE " + ClassName
			+ " SET GNAME=?,G_START=?,G_END=? WHERE GNO=?");
			System.out.print("������ �� ��ȣ :"); String updategno = sc.next();
			System.out.print("�� GNAME : "); String gname = sc.next();
			System.out.print("�� G_START : "); String g_start = sc.next();
			System.out.print("�� G_END : "); String g_end = sc.next();

			pstm.setString(1,gname);
			pstm.setString(2,g_start);
			pstm.setString(3,g_end);
			pstm.setString(4,updategno);

			int result = pstm.executeUpdate();  
			System.out.println(result +"���� ������ ���� ����");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void updatePart(String ClassName) {
		
		try {
			
			System.out.println("������ ���� �����ϼ���.");
			System.out.print("������ �� ��ȣ :"); String updategno = sc.next();
			System.out.println("������ �׸��� �����ϼ���.");
			System.out.println("1. GName, 2. G_START, 3. G_END");
			switch(sc.nextInt()) {
			case 1:
				pstm = conn.prepareStatement("UPDATE " + ClassName
				+ " SET GNAME=? WHERE GNO=?");
				System.out.print("�� GNAME : "); String gname = sc.next();
				pstm.setString(1,gname);
				pstm.setString(2, updategno);
				break;
			case 2:
				pstm = conn.prepareStatement("UPDATE " + ClassName
				+ " SET G_START=? WHERE GNO=?");
				System.out.print("�� G_START : "); String g_start = sc.next();
				pstm.setString(1,g_start);
				pstm.setString(2, updategno);
				break;
			case 3:
				pstm = conn.prepareStatement("UPDATE " + ClassName
				+ " SET G_END=? WHERE GNO=?");
				System.out.print("�� G_END : "); String g_end = sc.next();
				pstm.setString(1,g_end);
				pstm.setString(2, updategno);
				break;
			}
		
			int result = pstm.executeUpdate();  
			System.out.println(result +"���� ������ ���� ����");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void rollback() throws SQLException {
		conn.rollback();
		System.out.println("�ѹ� �Ϸ�!");
	}

	private static void commit() throws SQLException {
		conn.commit();
		System.out.println("Ŀ�� �Ϸ�!");
	}

	public static void selectAll(String className) throws SQLException{
		rs = stmt.executeQuery("select * from " + className);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		
		while(rs.next()) {
			for (int i = 1; i <= count; i++) {
				switch(rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getFloat(i) + " ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getDate(i) + " ");					
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " " + rs.getString(i) + " ");					
					break;
				}//end switch
			}//end for
			System.out.println();
		}//end while
	}//end select()
	
	//insert
	private static void insert() throws SQLException {
			System.out.print("GNO : "); String gno = sc.next();
			System.out.print("GNAME : "); String gname = sc.next();
			System.out.print("G_START : "); String g_start = sc.next();
			System.out.print("G_END : "); String g_end = sc.next();
		try {
			pstm = conn.prepareStatement("INSERT INTO GIFT VALUES(?,?,?,?)");
			pstm.setString(1, gno);
			pstm.setString(2, gname);
			pstm.setString(3, g_start);
			pstm.setString(4, g_end);
			
			int result = pstm.executeUpdate();  
			System.out.println(result +"���� ������ �߰� ����");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end insert()
	
	
}
