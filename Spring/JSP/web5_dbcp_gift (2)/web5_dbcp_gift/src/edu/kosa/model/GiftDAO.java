package edu.kosa.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dbclose.util.CloseUtil;

public class GiftDAO {
	private static GiftDAO instance = new GiftDAO();
	
	public static GiftDAO getInstance() {
		return instance;
	}
	
	private GiftDAO() { } 
	
	public Connection getConnection() throws Exception {
		//연결은 JNDI & Pool 형태로 연결 객체 생성해서 리턴 할것임
		Context ctx = new InitialContext();
		Context env = (Context)ctx.lookup("java:comp/env");
		DataSource ds = (DataSource)env.lookup("jdbc:MemberDB");
		
		return ds.getConnection();
	} // getConnection() end
	
	
	public ArrayList<GiftVO> selectAll() throws Exception {		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT GNO, GNAME, G_START, G_END FROM GIFT");
		
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sb.toString());
		ResultSet rs = pstmt.executeQuery(); // 받은 ㄱ려과값
		
		
		GiftVO vo = null;
		ArrayList<GiftVO> list = new ArrayList<>();
		
		while(rs.next()) {
			vo = new GiftVO();
			vo.setGno(rs.getInt("gno"));
			vo.setGname(rs.getString("gname"));
			vo.setgStart(rs.getInt("g_start"));
			vo.setgEnd(rs.getInt("g_end"));
			list.add(vo);			
		}
		CloseUtil.close(rs); CloseUtil.close(pstmt);
		return list;
	} // insert() end
	
	
}
