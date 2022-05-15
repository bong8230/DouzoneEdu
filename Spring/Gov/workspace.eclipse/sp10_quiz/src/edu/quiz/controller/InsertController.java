package edu.quiz.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.quiz.model.DeptDAO;
import edu.quiz.model.DeptDTO;

@Controller
public class InsertController {
	private DeptDAO deptDAO;

	public void setDeptDAO(DeptDAO deptDAO) {
		this.deptDAO = deptDAO;
	}
	
	@RequestMapping("/insert.do")
	public String insert(Model model,HttpServletRequest request) {
		String dcode = request.getParameter("dcode");
		String dname = request.getParameter("dname");
		String pdept = request.getParameter("pdept");
		String area = request.getParameter("area");
		
		DeptDTO dto = new DeptDTO();
		dto.setDcode(dcode);
		dto.setDname(dname);
		dto.setPdept(pdept);
		dto.setArea(area);
		
		deptDAO.insertDept(dto);
		
		return "list";
	}
	
}
