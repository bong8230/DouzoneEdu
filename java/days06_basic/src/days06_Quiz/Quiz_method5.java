package days06_Quiz;

import java.util.Scanner;

//�Է��ռ� Input()- �̸� ���� ���� ����
//�����ռ� total() - ����
//����Լ� average()
//���� grade()
//��� output()
public class Quiz_method5 {
	static int N =2;//�ο���
	static int K =4;//�̸�+�����
	static String[][] arr = new String[N][K];
	static int[] sum = new int[K-1];
	static double[] avg = new double[N];
	static char[] GR = new char[N];
	static String name,kor,eng,pc;
	
	static Scanner score = new Scanner(System.in);
	
	public static void Input() {
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
	}
	
	public static void Total() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				sum[i]+=Integer.parseInt(arr[i][j]);
			}
		}
	}
	
	public static void Avg() {
		for(int i=0;i<avg.length;i++) {
			avg[i] = sum[i]/sum.length;
		}
	}
	
	public static void grade() {
		for (int i = 0; i < GR.length; i++) {	
			if(avg[i]>=90) GR[i] ='A';
			else if(avg[i]>=80) GR[i] ='B';
			else if(avg[i]>=70) GR[i] ='C';
			else if(avg[i]>=60) GR[i] ='D';
			else GR[i] ='F';
		}
	}
	public static void Output() {
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
	public static void main(String[] args) {
		Input();
		Total();
		Avg();
		grade();
		Output();
	}
}
