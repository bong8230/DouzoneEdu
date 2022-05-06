package com.Info;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InfoController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String address = "단푸 101";
		ModelAndView mav = new ModelAndView();
		mav.addObject("address",address);
		mav.addObject("major","컴퓨터");
		mav.addObject("college","경기대");
//		mav.setViewName("main"); // /WEB-INF/jsp/+main+.jsp
		mav.setViewName("info");
		
		return mav;
	}

}

