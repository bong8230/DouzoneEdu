package days04_quiz;

import java.util.Scanner;

//����2 ��Ģ���� ���α׷� �ۼ�(����ó���ϱ�)  ���� 2�� �Է� �ް�, ������(+, -, *, /) 1�� �Է� �޾Ƽ� ( if, switch �̿� ) 

public class Quiz005_������ {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a, b;

		try {

			System.out.print("���� �ΰ��� �Է��ϼ��� : ");
			a = num.nextInt();
			b = num.nextInt();
			System.out.println("+, -, *, / �� �ϳ��� �Է��ϼ���");
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
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		} catch (Exception e) {
			System.out.println("Exception !!!");
		}
	}
}
