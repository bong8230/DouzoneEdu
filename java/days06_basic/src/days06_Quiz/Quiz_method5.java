package days06_Quiz;

import java.util.Scanner;

//입력합수 Input()- 이름 국어 영어 전산
//총점합수 total() - 총점
//평균함수 average()
//평점 grade()
//출력 output()
public class Quiz_method5 {
	static int N =2;//인원수
	static int K =4;//이름+과목수
	static String[][] arr = new String[N][K];
	static int[] sum = new int[K-1];
	static double[] avg = new double[N];
	static char[] GR = new char[N];
	static String name,kor,eng,pc;
	
	static Scanner score = new Scanner(System.in);
	
	public static void Input() {
		for (int i = 0; i < arr.length; i++) {
			int j=0;
			System.out.println(" 이름,국어,영어,전산 점수를 입력하세요");
			
			System.out.print("이름:");	name = score.next();
			arr[i][j] = name;
			System.out.print("국어:");	kor = score.next();
			arr[i][j+1] = kor;
			System.out.print("영어:");	eng = score.next();
			arr[i][j+2] = eng;
			System.out.print("전산:");	pc = score.next();
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
		//개개인의 과목별 점수 출력
				System.out.println("이름\t" +"국어\t"+"영어\t"+"전산\t"+"총합\t"+"평균\t" + "학점");
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
