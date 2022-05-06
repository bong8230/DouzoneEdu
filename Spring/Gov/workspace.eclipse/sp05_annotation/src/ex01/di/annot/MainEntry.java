package ex01.di.annot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Cats catsInfo = ctx.getBean("catsInfo",Cats.class);
		catsInfo.getMyCatsInfo();
		
		MyCats cat2 = ctx.getBean("cat2",MyCats.class);
		catsInfo.setMyCatsInfo(cat2);
		catsInfo.getMyCatsInfo();
		
		
		ctx.close();
		
		
		/*String configContext = "classpath:ex01/di/annot/appCtx.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(configContext);
		
		MyCats myCats = ctx.getBean("cat1",MyCats.class);
		Cats cats = ctx.getBean("cats",Cats.class);
		
		cats.setMyCatsInfo(myCats);
		cats.getMyCatsInfo();
		
		ctx.close();*/
	}
}
