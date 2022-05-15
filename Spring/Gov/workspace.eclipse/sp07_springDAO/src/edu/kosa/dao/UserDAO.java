package edu.kosa.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.kosa.model.UserVO;

public abstract class UserDAO {
	
	//디비연결관련 메소드
	public abstract Connection getConnection() throws Exception;
	PreparedStatement pstmt;
	ResultSet rs;
	Statement stmt;
	String query;
	
	//3. 사용
	//insert
	public void insert(UserVO user) throws Exception{
		Connection connection = getConnection();
		query = "INSERT INTO USERS(ID, NAME, PASSWORD) VALUES(?,?,?)";
		pstmt = connection.prepareStatement(query);
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getName());
		pstmt.setString(3, user.getPassword());
		
		int result = pstmt.executeUpdate();
		System.out.println(result + "개 입력 성공!");
		pstmt.close();
	}
	//selectAll
	public void selectAll(UserVO user) throws Exception{
		Connection connection = getConnection();
		query = "SELECT * FROM USERS ";
		pstmt = connection.prepareStatement(query);
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String password = rs.getString(3);
			
			System.out.println("User ID = " + id);
			System.out.println("User Name = " + name);
			System.out.println("User Password =" + password);
		}
		pstmt.close();
	}
	
	//selectByid - 조건에 맞는 레코드 select 
	public void selectById(UserVO user) throws Exception{
		Connection connection = getConnection();
		query = "SELECT * FROM USERS WHERE ID = ";
		pstmt = connection.prepareStatement(query+ "'"+ user.getId() + "'");
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String password = rs.getString(3);
			
			System.out.println("User ID = " + id);
			System.out.println("User Name = " + name);
			System.out.println("User Password =" + password);
		}
		pstmt.close();
	}
	//update
	public void Update(UserVO user) throws Exception{
		Connection connection = getConnection();
//		query = "UPDATE USERS SET password= "+ "'"+user.getPassword()+"'"+" WHERE ID="+ "'"+user.getId()+"'";
		query = "UPDATE USERS SET password = ?" + " WHERE ID = ?";
		pstmt = connection.prepareStatement(query);
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getId());
		int result = pstmt.executeUpdate();
		System.out.println(result+"개 update 완료");
		pstmt.close();
	}
	//delete
	
	//menu
	public void menu() {
		System.out.println("선택하세요");
		System.out.println("1. Insert");
		System.out.println("2. Select All");
		System.out.println("3. Select(조건)");
		System.out.println("4. 수정");
		System.out.println("5. 삭제");
	}
}
