package days06_Quiz;
//info() { �̸� ����ó �ּ� ����Լ�}

import java.util.Scanner;

public class Quiz_method1 {
	
	
	public static void insert() {
		System.out.println("�̸�, ����ó, �ּҸ� �Է��ϼ���:");
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
		System.out.println("�̸� :" + a );
		System.out.println("����ó :" + b);
		System.out.println("�ּ� :" + c);
	}
	
}
