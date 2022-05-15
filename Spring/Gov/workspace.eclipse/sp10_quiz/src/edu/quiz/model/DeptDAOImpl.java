package edu.quiz.model;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class DeptDAOImpl implements DeptDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List listDept() {
		String sql = "SELECT * FROM DEPT2 ORDER BY DCODE DESC";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void insertDept(DeptDTO dto) {
		String sql = "INSERT INTO DEPT2 (DCODE,DNAME,PDEPT,AREA) VALUES (?,?,?,?)";
		Object[] arr = { dto.getDcode(), dto.getDname(), dto.getPdept(), dto.getArea() };
		this.jdbcTemplate.update(sql,arr);
	}

	@Override
	public void updateDept(DeptDTO dto) {
		 String sql = "UPDATE DEPT2 SET VALUE=? WHERE DCODE=?";
		 Object[] arr = { dto.getPdept(), dto.getDcode() };
		 this.jdbcTemplate.update(sql,arr);
	}

	@Override
	public void deleteDept(DeptDTO dto) {
		String sql = "DELETE FROM DEPT2 WHERE DCODE=?";
		Object[] arr = {dto.getDcode()};
		this.jdbcTemplate.update(sql,arr);
	}
}
