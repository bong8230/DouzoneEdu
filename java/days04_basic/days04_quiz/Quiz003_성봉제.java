package days04_quiz;

import java.util.Scanner;

//����3 ����,����,���� ���� �Է¹޾Ƽ� ��� 60���̻��̰�,
//�� ���� ���� 40�����ϸ� ���� ���հ� ó���ϴ� ���α׷� �ۼ�
public class Quiz003_������ {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		System.out.println("�Է��ϼ���");
		
		System.out.print("����:");
		int kor = score.nextInt();	
		System.out.print("����:");
		int eng = score.nextInt();
		System.out.print("����:");
		int pc = score.nextInt();
		
		int sum = (kor+eng+pc);
		double avg = sum/3.0;
		
		if(avg>=60)
			if(kor<=40 || eng<=40 || pc<=40 ) System.out.println("���հ�");
			else System.out.println("�հ�");
		else System.out.println("���հ�");
	}
}
