package days03_quiz;

import java.util.Scanner;


public class quiz002 {
	public static void main(String[] args) {
		//����ǥ ����,����,����,�̸� �Է� �޾Ƽ� ����, ���
		int cnt = 0;
		//int[][] arr = new int[3][4];
		Scanner score = new Scanner(System.in);
		System.out.println("�Է��ϼ���");
		
		//for(int i=0;i<3;i++) {
		
			System.out.print("����:");
			int kor = score.nextInt();
			//arr[i][0] = kor;
			System.out.print("����:");
			int eng = score.nextInt();
			//arr[i][1] = eng;
			System.out.print("����:");
			int pc = score.nextInt();
			//arr[i][2] = pc;
			System.out.print("�̸�:");
			String name = score.next();
			//arr[i][3] = name;
			//int ksum += arr[i][0];
		//}
		int sum = (kor+eng+pc);
		double avg = sum/3.0;
		
		
		System.out.printf("�̸�: "+ name+"\n" +
						   "����: "+ sum + "\n" +
						   "���: "+ avg);
		
	}
}
