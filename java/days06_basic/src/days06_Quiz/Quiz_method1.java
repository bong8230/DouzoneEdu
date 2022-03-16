package days06_Quiz;
//info() { 이름 연락처 주소 출력함수}

import java.util.Scanner;

public class Quiz_method1 {
	
	
	public static void insert() {
		System.out.println("이름, 연락처, 주소를 입력하세요:");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		insert();
		
		String name = sc.next();
		String number = sc.next();
		String adress = sc.next();
		
		info(name,number,adress);
		
		sc.close();
	}
	
	public static void info(String a, String b, String c) {
		System.out.println("이름 :" + a );
		System.out.println("연락처 :" + b);
		System.out.println("주소 :" + c);
	}
	
}
