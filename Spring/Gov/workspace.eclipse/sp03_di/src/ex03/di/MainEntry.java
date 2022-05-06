package ex03.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex03/di/playerCtx.xml");
		
//		Player player = ctx.getBean("curling", Curling.class);
//		player.info();
		
		Player player = ctx.getBean("sport",SportInfo.class);
		player.input();
		player.info();
		
	}
}
