package gov.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Maincontroller implements Controller {
	
	/*public String process(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
	}*/
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String name = "김연아";
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name);
		mav.addObject("age",23);
//		mav.setViewName("main"); // /WEB-INF/jsp/+main+.jsp
		mav.setViewName("main");
		
		return mav;
	}
}
