package days04_basic;

import java.util.Scanner;

public class SwitchGrade {
	public static void main(String[] args) {
		//����ǥ ����,����,����,�̸� �Է� �޾Ƽ� ����, ���
				
				Scanner score = new Scanner(System.in);
				
				System.out.println("�̸��� �Է��ϼ���");
				String name = score.nextLine();
				System.out.print("����:");
				int kor = score.nextInt();	
				System.out.print("����:");
				int eng = score.nextInt();
				System.out.print("����:");
				int pc = score.nextInt();
				
				
				int sum = (kor+eng+pc);
				double avg = sum/3.0;
				
				String grade;
				//����(����):A~F����
				switch((int)avg/10) {
					case 10 : 
					case 9 : grade ="A"; break;   
					case 8 : grade ="B"; break;
					case 7 : grade ="C"; break;
					case 6 : grade ="D"; break;
					default : grade ="F";
				}
				
			
				System.out.println("�̸�: "+ name);
				System.out.printf( "����: "+ sum + "\n" +
								   "���: %.2f" + "\n" +
								   "����: "+ grade + "\n",avg);
	}
}
