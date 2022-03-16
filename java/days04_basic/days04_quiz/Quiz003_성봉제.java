package days04_quiz;

import java.util.Scanner;

//문제3 전산,영어,국어 점수 입력받아서 평균 60점이상이고,
//각 과목 과락 40점이하면 과목 불합격 처리하는 프로그램 작성
public class Quiz003_성봉제 {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		System.out.println("입력하세요");
		
		System.out.print("국어:");
		int kor = score.nextInt();	
		System.out.print("영어:");
		int eng = score.nextInt();
		System.out.print("전산:");
		int pc = score.nextInt();
		
		int sum = (kor+eng+pc);
		double avg = sum/3.0;
		
		if(avg>=60)
			if(kor<=40 || eng<=40 || pc<=40 ) System.out.println("불합격");
			else System.out.println("합격");
		else System.out.println("불합격");
	}
}
