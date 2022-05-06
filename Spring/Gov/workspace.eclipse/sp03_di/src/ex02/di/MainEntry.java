package ex02.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ex02/di/memberCtx.xml");
		
		MemberDAO dao = context.getBean("dao",MemberDAO.class);
		dao.insert();
	}
}
