package days06_Quiz;

import java.util.Scanner;

//max() 두개정수입력 받아서 큰수 리턴하는 함수
public class Quiz_method3 {
	public static int Max(int a, int b) {
		if(a>b) return a;
		else return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(Max(a,b));
	}
}
