package days04_basic;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {

		System.out.print("����� ����Ʈ�� = ");
		int point = new Scanner(System.in).nextInt();

		switch (point) { // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
			case 1:
				System.out.println("�� ");	//break;
			case 2:
				System.out.println("�ǾƳ� ");	//break;
			case 3:
				System.out.println("��� ");	//break;
		}// end switch
			
			System.out.println("��ǰ��÷ ����");
	}
}
