package days03_quiz;

import java.util.Scanner;


public class quiz002 {
	public static void main(String[] args) {
		//성적표 국어,영어,전산,이름 입력 받아서 총점, 평균
		int cnt = 0;
		//int[][] arr = new int[3][4];
		Scanner score = new Scanner(System.in);
		System.out.println("입력하세요");
		
		//for(int i=0;i<3;i++) {
		
			System.out.print("국어:");
			int kor = score.nextInt();
			//arr[i][0] = kor;
			System.out.print("영어:");
			int eng = score.nextInt();
			//arr[i][1] = eng;
			System.out.print("전산:");
			int pc = score.nextInt();
			//arr[i][2] = pc;
			System.out.print("이름:");
			String name = score.next();
			//arr[i][3] = name;
			//int ksum += arr[i][0];
		//}
		int sum = (kor+eng+pc);
		double avg = sum/3.0;
		
		
		System.out.printf("이름: "+ name+"\n" +
						   "총점: "+ sum + "\n" +
						   "평균: "+ avg);
		
	}
}
