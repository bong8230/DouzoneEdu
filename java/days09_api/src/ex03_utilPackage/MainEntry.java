package ex03_utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // system이 갖고 있는 날짜 얻어옴
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println(c.get(Calendar.MONTH)+1 + "월"); // 월은 0부터 시작
		System.out.println(c.get(Calendar.DATE) + "일");
		
		Date date = new Date();
		int h= date.getHours();
		int m = date.getMinutes();
		int s= date.getSeconds();
		
		System.out.println(h+" "+m+" "+s);
		
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2018,12,20);
		
		if(c1.after(c2)) {
			System.out.println("현재시간은 2022년 1월 1일 이후");
		}else if(c1.before(c2)) System.out.println("현재시각은 2022년 1월1일 이전");
		else System.out.println("현재시각은 2022년");
	}
}
