package days5_Quiz;

import java.util.Scanner;

//����ǥ ���α׷� �ۼ�(�迭�̿�) -��
// �̸�, ����,����,���� ���� �Է� �޾Ƽ� ����/���/����(����) ���ϴ� ���α׷� �ۼ�
public class Score_Array_ {
	public static void main(String[] args) {
			int N =2;//�ο���
			int K =4;//�̸�+�����
			String[][] arr = new String[N][K];
			int[] sum = new int[K-1];
			double[] avg = new double[N];
			char[] GR = new char[N];
			String name, kor, eng, pc;
			Scanner score = new Scanner(System.in);
			
			//������ ����
			for (int i = 0; i < arr.length; i++) {
				int j=0;
				System.out.println(" �̸�,����,����,���� ������ �Է��ϼ���");
				
				System.out.print("�̸�:");	name = score.next();
				arr[i][j] = name;
				System.out.print("����:");	kor = score.next();
				arr[i][j+1] = kor;
				System.out.print("����:");	eng = score.next();
				arr[i][j+2] = eng;
				System.out.print("����:");	pc = score.next();
				arr[i][j+3] = pc;
				
			}
			//�������� �Ѱ��� ����
			for (int i = 0; i < arr.length; i++) {
				for (int j = 1; j < arr[i].length; j++) {
					sum[i]+=Integer.parseInt(arr[i][j]);
				}
			}
			
			//�������� �Ѱ��� ���
			for(int i=0;i<avg.length;i++) {
				avg[i] = sum[i]/sum.length;
			}
			
			//������ ����
			for (int i = 0; i < GR.length; i++) {	
				if(avg[i]>=90) GR[i] ='A';
				else if(avg[i]>=80) GR[i] ='B';
				else if(avg[i]>=70) GR[i] ='C';
				else if(avg[i]>=60) GR[i] ='D';
				else GR[i] ='F';
			}
			
			
			//�������� ���� ���� ���
			System.out.println("�̸�\t" +"����\t"+"����\t"+"����\t"+"����\t"+"���\t" + "����");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf(arr[i][j] +"\t");
				}
				System.out.print(sum[i]+"\t"+avg[i]+"\t"+GR[i]);
				System.out.println();
			}
	}
}
