package days04_quiz;

import java.util.Scanner;

//과제2 사칙연산 프로그램 작성(예외처리하기)  숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서 ( if, switch 이용 ) 

public class Quiz005_성봉제 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a, b;

		try {

			System.out.print("숫자 두개를 입력하세요 : ");
			a = num.nextInt();
			b = num.nextInt();
			System.out.println("+, -, *, / 중 하나를 입력하세요");
			String c = num.next();

			switch (c) {
			case "+":
				System.out.printf(a + " + " + b + " = " + "%d", a + b);
				break;
			case "-":
				System.out.printf(a + " - " + b + " = " + "%d", a - b);
				break;
			case "*":
				System.out.printf(a + " * " + b + " = " + "%d", a * b);
				break;
			case "/":
				System.out.printf(a + " / " + b + " = " + "%d", a / b);
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}

		} catch (Exception e) {
			System.out.println("Exception !!!");
		}
	}
}
