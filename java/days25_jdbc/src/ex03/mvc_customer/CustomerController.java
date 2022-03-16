package ex03.mvc_customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import DBconnutil.DBConnection;

public class CustomerController {
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstm = null;

	public static void connect() throws SQLException{
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		conn.setAutoCommit(false);
	}

	public static void menu() throws SQLException {
		Customer ct = new Customer();
		while(true) {
			System.out.println("\t 0.rollback");
			DBConnection.menu();

			switch(sc.nextInt()) {
			case 0:
				System.out.println("Commit 하시겠습니까??(Y/N)");
				System.out.println("안하신다면 Rollback 됩니다.");
				if(sc.next().equalsIgnoreCase("Y")) {
					commit();
					selectAll(ct.ClassName);
				} else {
					rollback();
					selectAll(ct.ClassName);
				}
				break;
			case 1:
				selectAll(ct.getClassName());
				insert(ct.ClassName);
				selectAll(ct.getClassName());
				break;

			case 2:
				System.out.println("1. 전체수정");
				System.out.println("2. 부분수정");
				switch(sc.nextInt()) {
				case 1:
					updateAll(ct.ClassName);
					break;
				case 2:
					updatePart(ct.ClassName);
					break;
				}

				selectAll(ct.getClassName());
				break;
			case 3:
				selectAll(ct.ClassName);
				break;
			case 4:
				selectIf(ct.ClassName);
				break;
			case 5:
				delete(ct.ClassName);
				selectAll(ct.ClassName);
				break;
			case 6:
				close();
				System.out.println("프로그램 종료");
				System.exit(0);
			}//end switch
		}//end while
	}

	private static void selectAll(String className) throws SQLException {
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

	}

	private static void selectIf(String className) throws SQLException {
		pstm = conn.prepareStatement("select * from " + className + " where code=?" );
		System.out.println("행 번호 : "); String cno = sc.next();
		pstm.setString(1, cno);

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

	private static void updateAll(String className) {
		try {
			pstm = conn.prepareStatement("UPDATE " + className + 
							" SET NAME=?,EMAIL=?,PHONE=? WHERE CODE=?");
			System.out.print("수정할 행 번호 :"); String updatecno = sc.next();
			System.out.print("새 NAME : "); String cname = sc.next();
			System.out.print("새 EMAIL : "); String cemail = sc.next();
			System.out.print("새 PHONE : "); String cphone = sc.next();

			pstm.setString(1,cname);
			pstm.setString(2,cemail);
			pstm.setString(3,cphone);
			pstm.setString(4,updatecno);

			int result = pstm.executeUpdate();  
			System.out.println(result +"개의 데이터 수정 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void updatePart(String className) {
		try {

			System.out.println("수정할 행을 선택하세요.");
			System.out.print("수정할 행 번호 :"); String updatecno = sc.next();
			System.out.println("수정할 항목을 선택하세요.");
			System.out.println("1. NAME, 2. EMAIL, 3. PHONE");
			switch(sc.nextInt()) {
			case 1:
				pstm = conn.prepareStatement("UPDATE " + className
						+ " SET NAME=? WHERE CODE=?");
				System.out.print("새 NAME : "); String cname = sc.next();
				pstm.setString(1,cname);
				pstm.setString(2, updatecno);
				break;
			case 2:
				pstm = conn.prepareStatement("UPDATE " + className
						+ " SET EMAIL=? WHERE CODE=?");
				System.out.print("새 EMAIL : "); String cemail = sc.next();
				pstm.setString(1,cemail);
				pstm.setString(2, updatecno);
				break;
			case 3:
				pstm = conn.prepareStatement("UPDATE " + className
						+ " SET PHONE=? WHERE CODE=?");
				System.out.print("새 PHONE : "); String cphone = sc.next();
				pstm.setString(1,cphone);
				pstm.setString(2, updatecno);
				break;
			}

			int result = pstm.executeUpdate();  
			System.out.println(result +"개의 데이터 수정 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insert(String className) {
		System.out.print("CODE : "); String cno = sc.next();
		System.out.print("NAME : "); String cname = sc.next();
		System.out.print("EMAIL : "); String cemail = sc.next();
		System.out.print("PHONE : "); String cphone = sc.next();
		try {
			pstm = conn.prepareStatement("INSERT INTO " + className  +" VALUES(?,?,?,?)");
			pstm.setString(1, cno);
			pstm.setString(2, cname);
			pstm.setString(3, cemail);
			pstm.setString(4, cphone);

			int result = pstm.executeUpdate();  
			System.out.println(result +"개의 데이터 추가 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void delete(String className) throws SQLException {
		pstm = conn.prepareStatement("delete from " + className + " where code=?" );
		System.out.println("삭제할 행 번호 : "); String cno = sc.next();
		pstm.setString(1, cno);
		pstm.executeUpdate();

	}

	private static void commit() throws SQLException {
		conn.commit();
		System.out.println("커밋 완료!");

	}

	private static void rollback() throws SQLException {
		conn.rollback();
		System.out.println("롤백 완료!");
	}

	private static void close() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
