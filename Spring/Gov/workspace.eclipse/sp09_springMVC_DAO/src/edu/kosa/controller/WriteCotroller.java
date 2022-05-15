package edu.kosa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kosa.model.GuestDAO;
import edu.kosa.model.GuestDTO;

@Controller
public class WriteCotroller {

	private GuestDAO guestDAO;

	public void setGuestDAO(GuestDAO guestDAO) {
		this.guestDAO = guestDAO;
	}

	@RequestMapping("/write.do")
	 public String write(Model model, HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String home = request.getParameter("home");
		String contents = request.getParameter("contents");
		int num = Integer.parseInt(request.getParameter("no"));
		
		GuestDTO dto = new GuestDTO();
		dto.setName(name);
		dto.setEmail(email);
		dto.setHome(home);
		dto.setContents(contents);
		dto.setNum(num);
		
		guestDAO.insertGuest(dto);
		
		return "list"; // /WEB-INF/views/ + list + .jsp
	 }
}
