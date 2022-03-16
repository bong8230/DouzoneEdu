package ex03.mvc_customer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	private static Connection conn;

	private DBConnection() {
	}

	static {
		// 환경설정 파일을 읽어오기 위한 객체 생성
		Properties properties  = new Properties();
		Reader reader;
		try {
			reader = new FileReader("C:\\Users\\82108\\JavaStudy\\workspace\\days25_jdbc\\src\\oracle.properties");  // 읽어올 파일 지정
			properties.load(reader);                           // 설정 파일 로딩하기
		} catch (FileNotFoundException e1) {
			System.out.println("예외: 지정한 파일을 찾을수없습니다 :" + e1.getMessage());
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String driverName = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String pwd = properties.getProperty("password");

		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("connection success");
		} catch (ClassNotFoundException e) {
			System.out.println("예외: 드라이버로드 실패 :" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("예외: connection fail :" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}
	
	public static void menu() {
		System.out.println("=====JDBC Query=====");
		System.out.println("\t 1.레코드 삽입(추가)");
		System.out.println("\t 2.레코드 수정");
		System.out.println("\t 3.전체보기");
		System.out.println("\t 4.조건에 의한 검색(ex>>고객번호)");
		System.out.println("\t 5.레코드 삭제");
		System.out.println("\t 6.프로그램 종료");
		System.out.println("원하는 메뉴 선택하세요.");
	}
}







