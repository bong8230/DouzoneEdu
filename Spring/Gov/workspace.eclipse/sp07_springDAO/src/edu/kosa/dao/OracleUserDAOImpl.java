package edu.kosa.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleUserDAOImpl extends UserDAO {
	@Override
	public Connection getConnection() throws Exception{
		//1.드라이브 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("cloud driver load success");
		//2.연결 및 오픈
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@bongsdbdb_high?TNS_ADMIN=C:/DB_Wallet/Wallet_bongsdbdb",
				"admin",
				"Seong2230!@#"
				);
		System.out.println("connect success");
		return connection;
	}
}
