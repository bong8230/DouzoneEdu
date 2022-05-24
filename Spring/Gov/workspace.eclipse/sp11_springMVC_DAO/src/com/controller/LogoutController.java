package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {
	@RequestMapping("/logout.do")
	public String out(HttpSession session) {
		session.invalidate();//세션정보종료
		
		return "loginForm";
	}
}
