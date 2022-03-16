package days04_quiz;

import java.util.Scanner;

//과제3 원하는 단을 입력 받아서 구구단 출력하는 프로그램 작성

public class Quiz006_성봉제 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("원하시는 단을 입력하세요(1~9):");
		int num = n.nextInt();
		gugudan(num);
	}
	
	public static void gugudan(int num) {
		System.out.println(num+"단");
		for(int i=1;i<10;i++) {
			System.out.printf(num + "*" + i + "= %d \n",num*i);
		}
	}
}
