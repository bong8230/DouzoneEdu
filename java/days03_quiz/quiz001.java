package days03_quiz;

import java.util.Scanner;

public class quiz001 {
	public static void main(String[] args) {
		// %,/ ��������� �̿��� ��� ��� ����ϱ�
		//Scanner num = new Scanner(System.in);
		
		//1. ��������
		//int pay = num.nextInt();
		int pay = 567890;
		int any1 = pay%10000; //7890
		int any2 = any1%1000; // 890
		int any3 = any2%100; //90
		
		// 2. �޼��� ��� �� �Է¹ޱ�
		// 3. ó�� ���
		// 4. ������
		
		System.out.println("10000�� : " + pay/10000 +"��");
		System.out.println("1000�� : " + any1/1000 + "��");
		System.out.println("100�� : " + any2/100 + "��");
		System.out.println("10�� : " + any3/10 + "��");
		
		
		
		
		//result:
		//10000�� : 56
		//1000�� : 7
		//100�� : 8
		//10�� : 9
	}
}
