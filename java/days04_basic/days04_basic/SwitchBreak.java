package days04_basic;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {

		System.out.print("당신의 포인트는 = ");
		int point = new Scanner(System.in).nextInt();

		switch (point) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case 1:
				System.out.println("집 ");	//break;
			case 2:
				System.out.println("피아노 ");	//break;
			case 3:
				System.out.println("우산 ");	//break;
		}// end switch
			
			System.out.println("상품당첨 ㅊㅊ");
	}
}
