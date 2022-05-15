package edu.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertFormController {
	@RequestMapping("/insertForm")
	public String insertForm(Model model) {
		
		return "insertform";
	}
}
