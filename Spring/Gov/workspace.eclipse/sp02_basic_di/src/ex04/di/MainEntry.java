package ex04.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				//new ClassPathXmlApplicationContext("ex04/di/appCtx.xml");
				new ClassPathXmlApplicationContext("appCtx.xml");
//				new ClassPathXmlApplicationContext(new String[] {"appCtx.xml", "testCtx.xml"});
		
		//NewRecordViewImpl view = context.getBean("view");
		//IRecordView view = (NewRecordViewImpl)context.getBean("newRecordViewImpl");
		IRecordView view = (NewRecordViewImpl)context.getBean("x");
		view.input();
		view.print();
	}
}
