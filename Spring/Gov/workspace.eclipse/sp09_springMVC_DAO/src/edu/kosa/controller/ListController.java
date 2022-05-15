package edu.kosa.controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kosa.model.GuestDAO;

@Controller
public class ListController {

		private GuestDAO guestDAO; //DB 연결

		public void setGuestDAO(GuestDAO guestDAO) { //DI
			this.guestDAO = guestDAO;
		}
		
		//@RequestMapping("list/aa.do") //localhost:8080/list/aa.do
		@RequestMapping("list.do")
		public String list(Model model) {
			
			List list = guestDAO.listGuest();
			
			model.addAttribute("list",list); //data save
			
			return "list"; // /WEB-INF/views/ + list + .jsp
		}
}
