package com.Info;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InformationController {
//	@RequestMapping("/")
	@RequestMapping(value="/aa",method = RequestMethod.GET)
	public String info(Model model) {
		
		model.addAttribute("address","송파구 가락동");
		model.addAttribute("name","bongbong");
		model.addAttribute("age",25);
		return "main"; // /WEB-INF/views/ + info + .jsp
	}

}
