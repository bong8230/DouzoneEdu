package days04_quiz;

import java.util.Scanner;

//문제2 윤년/평년 판정프로그램 작성
// if(year%4 ==0)
//		if(year%100 !=0) || if(year%400==0)
public class Quiz002_성봉제 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		String str=" ";
		boolean flag = false;
		System.out.print("연도를 입력하세요:");
		int year = num.nextInt();
		
		//교수님코드
		if((year%4==0)&&(year%100!=0 || year%400==0)) flag =true;
		
		str = (flag==true)? "윤년":"평년";
		System.out.println(year + "년 ====> " + str);
		
//		//내코드
//		if(year%4==0) {if(year%100 != 0 || year%400==0) System.out.println("윤년");}
//		else System.out.println("평년");
			
	}
}
