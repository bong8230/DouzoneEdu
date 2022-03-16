package days06_Quiz;

import java.util.Scanner;

// add(x,y), sub(-) 
// mul(*) div(/) ����Ÿ�� 
// div(/) ����ó��
public class Quiz_method4 {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		int d;
		try {
			d = a/b;
		}catch(ArithmeticException e) {
			d = -1;
			System.out.println("���� 0�����Դϴ�.");
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		add(x,y);
		sub(x, y);
		System.out.println(mul(x,y));
		System.out.println(div(x,y));
	}
}
