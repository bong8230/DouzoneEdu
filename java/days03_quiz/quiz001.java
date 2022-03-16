package days03_quiz;

import java.util.Scanner;

public class quiz001 {
	public static void main(String[] args) {
		// %,/ 산술연산자 이용한 계산 결과 출력하기
		//Scanner num = new Scanner(System.in);
		
		//1. 변수선언
		//int pay = num.nextInt();
		int pay = 567890;
		int any1 = pay%10000; //7890
		int any2 = any1%1000; // 890
		int any3 = any2%100; //90
		
		// 2. 메세지 출력 및 입력받기
		// 3. 처리 계산
		// 4. 결과출력
		
		System.out.println("10000원 : " + pay/10000 +"장");
		System.out.println("1000원 : " + any1/1000 + "장");
		System.out.println("100원 : " + any2/100 + "개");
		System.out.println("10원 : " + any3/10 + "개");
		
		
		
		
		//result:
		//10000원 : 56
		//1000원 : 7
		//100원 : 8
		//10원 : 9
	}
}
