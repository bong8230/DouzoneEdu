package days5_Quiz;

import java.util.Scanner;

//������ 0~100�� ���̰��� �Է¹ޱ�
//y/n �Է¹޾� ���� ���Է�
public class Score_While {
	public static void main(String[] args) {

		int kor, eng, pc;
		String name; 
		char answer;
		boolean flag = false;
		Scanner score = new Scanner(System.in);
		int n=0;
		
		while (true) {
			
			System.out.println("�Է��ϼ���");
			System.out.print("�̸�:");
			name = score.next();

		
				System.out.print("����:");	kor = score.nextInt();
				System.out.print("����:");	eng = score.nextInt();
				System.out.print("����:");	pc = score.nextInt();
			

			int sum = (kor + eng + pc);
			double avg = sum / 3.0;

			System.out.printf("�̸�: " + name + "\n" + "����: " + sum + "\n" + "���: " + avg + "\n");

			System.out.print("�� �ۼ��Ͻðڽ��ϱ�?(Y/N)"); answer = score.next().charAt(0);
		
			//if(answer=="Y"||answer=="y") n=0;
			if(answer=='N'||answer=='n') break;
		}
	}
