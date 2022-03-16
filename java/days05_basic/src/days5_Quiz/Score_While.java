package days5_Quiz;

import java.util.Scanner;

//점수는 0~100점 사이값만 입력받기
//y/n 입력받아 점수 재입력
public class Score_While {
	public static void main(String[] args) {

		int kor, eng, pc;
		String name; 
		char answer;
		boolean flag = false;
		Scanner score = new Scanner(System.in);
		int n=0;
		
		while (true) {
			
			System.out.println("입력하세요");
			System.out.print("이름:");
			name = score.next();

		
				System.out.print("국어:");	kor = score.nextInt();
				System.out.print("영어:");	eng = score.nextInt();
				System.out.print("전산:");	pc = score.nextInt();
			

			int sum = (kor + eng + pc);
			double avg = sum / 3.0;

			System.out.printf("이름: " + name + "\n" + "총점: " + sum + "\n" + "평균: " + avg + "\n");

			System.out.print("더 작성하시겠습니까?(Y/N)"); answer = score.next().charAt(0);
		
			//if(answer=="Y"||answer=="y") n=0;
			if(answer=='N'||answer=='n') break;
		}
	}
