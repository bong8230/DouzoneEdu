package ex02.aop;

//import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		//클래스를 통해 실행
		Calc c = new CalcImpl();
		
		//proxy를 통해 실행
		Calc proxy = (Calc)Proxy.newProxyInstance(
				c.getClass().getClassLoader(),//loader:클래스찾기 
				c.getClass().getInterfaces(),//interface :행위(함수)
				new LogPrintHandlerImpl(c));//handler:보조업무 구현
		
		//클래스를 통해 실행
		System.out.println(c.add(1, 2));
		System.out.println(c.mul(10, 30));
		System.out.println("----------------------");
		//proxy를 통해 실행
		System.out.println(proxy.add(5, 5));
		System.out.println(proxy.mul(3, 9));
	}
}
