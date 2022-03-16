package days06_Quiz;

import java.util.Scanner;

//abs(int x) 절대값 출력
public class Quiz_method2 {
	
	public static int abs(int n) {
		if(n<0) return -1*n;
		return n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(abs(num));
	}
}
