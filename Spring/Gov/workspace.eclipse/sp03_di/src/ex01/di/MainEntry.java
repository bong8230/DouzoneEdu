package ex01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
//		MessageBean  mb = new MessageBeanImpl("yuna", "Hello");
//		mb.setGreeting("hi");
//		mb.setName("gildong");
//		mb.sayHello();
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ex01/di/applicationContext.xml");
		
		//MessageBean bean = (MessageBean)context.getBean("messageBeanImpl");
		MessageBean bean = (MessageBean)context.getBean("mb");
		bean.sayHello();
	}
}









