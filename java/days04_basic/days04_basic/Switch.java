package days04_basic;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		System.out.println("����� ����Ʈ ������?(1~3):");
		int point = new Scanner(System.in).nextInt();

		switch (point) { // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
			case 1:
				System.out.println("����Ʈ  ���� 1�� �Դϴ�.");
				break;
			case 2:
				System.out.println("����Ʈ  ���� 2�� �Դϴ�.");
				break;
			case 3:
				System.out.println("����Ʈ  ���� 3�� �Դϴ�.");
				break;
			default:
				System.out.println("���� �����Դϴ�. 1~3������ �Է� ���");

		}// end switch
	}
}
