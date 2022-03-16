package days04_basic;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {

		System.out.println("도시를 선택하세요(s,d,b,j):");
		char ch = new Scanner(System.in).next().charAt(0); // charater data

		switch (ch) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case 's':
				System.out.print("서울");	break;
			case 'd':
				System.out.print("대구");	break;
			case 'b':
				System.out.print("부산");	break;
			case 'j':
				System.out.print("제주");	break;
			default:
				System.out.println("잘못눌렀음 ㅡㅡ");
				System.exit(0); //프로그램 강제종료
		}// end switch
		System.out.println("를(을) 선택하셨습니다.");
	}
}

/*
package days04_basic;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {

		System.out.println("도시를 선택하세요(s,d,b,j):");
		String ch = new Scanner(System.in).next(); //String data

		switch (ch) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case "s":
				System.out.print("서울");	break;
			case "d":
				System.out.print("대구");	break;
			case "b":
				System.out.print("부산");	break;
			case "j":
				System.out.print("제주");	break;
			default:
				System.out.println("잘못눌렀음 ㅡㅡ");
				System.exit(0);
		}// end switch
		System.out.println("를(을) 선택하셨습니다.");
	}
}
*/