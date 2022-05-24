package com.kosa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kosa.config.SqlSessionFactoryService;
import com.kosa.model.GuestDTO;

@Component
public class GuestDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public GuestDAO() {
		sqlSessionFactory = SqlSessionFactoryService.getsqlSessionFactory();
	}

	public List<GuestDTO> getAllList(){
		SqlSession session = null;
		
		try {
			session = sqlSessionFactory.openSession();
			return session.selectList("GuestDAO.getAllList");
		} catch (Exception e) {
			return null;
		} finally {
			if(session != null) {
				session.close();
			}
		}
		
	}

}
