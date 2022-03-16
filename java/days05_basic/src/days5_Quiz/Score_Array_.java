package days5_Quiz;

import java.util.Scanner;

//성적표 프로그램 작성(배열이용) -명
// 이름, 국어,영어,전산 점수 입력 받아서 총점/평균/학점(평점) 구하는 프로그램 작성
public class Score_Array_ {
	public static void main(String[] args) {
			int N =2;//인원수
			int K =4;//이름+과목수
			String[][] arr = new String[N][K];
			int[] sum = new int[K-1];
			double[] avg = new double[N];
			char[] GR = new char[N];
			String name, kor, eng, pc;
			Scanner score = new Scanner(System.in);
			
			//데이터 삽입
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
			//개개인의 총과목 총합
			for (int i = 0; i < arr.length; i++) {
				for (int j = 1; j < arr[i].length; j++) {
					sum[i]+=Integer.parseInt(arr[i][j]);
				}
			}
			
			//개개인의 총과목 평균
			for(int i=0;i<avg.length;i++) {
				avg[i] = sum[i]/sum.length;
			}
			
			//개개인 학점
			for (int i = 0; i < GR.length; i++) {	
				if(avg[i]>=90) GR[i] ='A';
				else if(avg[i]>=80) GR[i] ='B';
				else if(avg[i]>=70) GR[i] ='C';
				else if(avg[i]>=60) GR[i] ='D';
				else GR[i] ='F';
			}
			
			
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
}
