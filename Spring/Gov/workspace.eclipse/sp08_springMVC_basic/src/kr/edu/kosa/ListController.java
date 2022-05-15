package kr.edu.kosa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListController {
	/*@RequestMapping("/list.html")*/
	@RequestMapping(value="/list.html",method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list","List page 입니다"); //data save
		model.addAttribute("title","title  입니다");
		model.addAttribute("content","content 입니다");
		
		return "list"; //  /WEB-INF
	}
}

