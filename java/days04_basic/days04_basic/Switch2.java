package days04_basic;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {

		System.out.println("���ø� �����ϼ���(s,d,b,j):");
		char ch = new Scanner(System.in).next().charAt(0); // charater data

		switch (ch) { // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
			case 's':
				System.out.print("����");	break;
			case 'd':
				System.out.print("�뱸");	break;
			case 'b':
				System.out.print("�λ�");	break;
			case 'j':
				System.out.print("����");	break;
			default:
				System.out.println("�߸������� �Ѥ�");
				System.exit(0); //���α׷� ��������
		}// end switch
		System.out.println("��(��) �����ϼ̽��ϴ�.");
	}
}

/*
package days04_basic;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {

		System.out.println("���ø� �����ϼ���(s,d,b,j):");
		String ch = new Scanner(System.in).next(); //String data

		switch (ch) { // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
			case "s":
				System.out.print("����");	break;
			case "d":
				System.out.print("�뱸");	break;
			case "b":
				System.out.print("�λ�");	break;
			case "j":
				System.out.print("����");	break;
			default:
				System.out.println("�߸������� �Ѥ�");
				System.exit(0);
		}// end switch
		System.out.println("��(��) �����ϼ̽��ϴ�.");
	}
}
*/