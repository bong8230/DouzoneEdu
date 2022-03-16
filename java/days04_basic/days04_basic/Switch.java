package days04_basic;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		System.out.println("당신의 포인트 점수는?(1~3):");
		int point = new Scanner(System.in).nextInt();

		switch (point) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case 1:
				System.out.println("포인트  점수 1점 입니다.");
				break;
			case 2:
				System.out.println("포인트  점수 2점 입니다.");
				break;
			case 3:
				System.out.println("포인트  점수 3점 입니다.");
				break;
			default:
				System.out.println("없는 점수입니다. 1~3까지만 입력 요망");

		}// end switch
	}
}
