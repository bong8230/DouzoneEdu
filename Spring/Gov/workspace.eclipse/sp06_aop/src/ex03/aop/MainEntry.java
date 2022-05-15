package ex03.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		String config = "classpath:ex03/aop/appCtx.xml";
		
		//Proxy 만들고 객체를 넘기고 필요한 객체를 생성하는 작업은 이미 xml 파일을 통해서 설정함
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		Calc proxy = context.getBean("proxy",Calc.class);
		System.out.println(proxy.add(5, 10));
		System.out.println(proxy.sub(30, 20, 10));
		System.out.println(proxy.mul(2, 4));
	}
}
