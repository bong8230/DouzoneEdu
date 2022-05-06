package ex01.di.annot;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("앞발들기");
		hobbys.add("뒹굴기");
		
		MyCats myCats = new MyCats("냥이",12,hobbys);
		myCats.setWeight(3.0);
		myCats.setColor("black");
		
		return myCats;
	}
	
	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("윙크하기");
		hobbys.add("윙");
		hobbys.add("크");
		MyCats myCats = new MyCats("나비야", 3, hobbys);
		myCats.setWeight(4.5);
		myCats.setColor("white");
		return myCats;
	}
	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());
		return cats;
	}
}

