package days04_quiz;

import java.util.Scanner;

public class Quiz001 {
	public static void main(String[] args) {
		//����ǥ ����,����,����,�̸� �Է� �޾Ƽ� ����, ���
				int cnt = 0;
				
				Scanner score = new Scanner(System.in);
				System.out.println("�Է��ϼ���");
				
				System.out.print("����:");
				int kor = score.nextInt();	
				System.out.print("����:");
				int eng = score.nextInt();
				System.out.print("����:");
				int pc = score.nextInt();
				System.out.print("�̸�:");
				String name = score.next();
				
				int sum = (kor+eng+pc);
				double avg = sum/3.0;
				
				//����(����):A~F����
				char grade=' ';
				if(avg>=90) grade ='A';
				else if(avg>=80) grade ='B';
				else if(avg>=70) grade ='C';
				else if(avg>=60) grade ='D';
				else grade ='F';
				
			
				
				System.out.printf("�̸�: "+ name+"\n" +
								   "����: "+ sum + "\n" +
								   "���: "+ avg + "\n" +
								   "����: "+ grade + "\n");
	}
}
