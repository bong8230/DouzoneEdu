package days04_quiz;

import java.util.Scanner;

public class Quiz001 {
	public static void main(String[] args) {
		//성적표 국어,영어,전산,이름 입력 받아서 총점, 평균
				int cnt = 0;
				
				Scanner score = new Scanner(System.in);
				System.out.println("입력하세요");
				
				System.out.print("국어:");
				int kor = score.nextInt();	
				System.out.print("영어:");
				int eng = score.nextInt();
				System.out.print("전산:");
				int pc = score.nextInt();
				System.out.print("이름:");
				String name = score.next();
				
				int sum = (kor+eng+pc);
				double avg = sum/3.0;
				
				//학점(평점):A~F학점
				char grade=' ';
				if(avg>=90) grade ='A';
				else if(avg>=80) grade ='B';
				else if(avg>=70) grade ='C';
				else if(avg>=60) grade ='D';
				else grade ='F';
				
			
				
				System.out.printf("이름: "+ name+"\n" +
								   "총점: "+ sum + "\n" +
								   "평균: "+ avg + "\n" +
								   "학점: "+ grade + "\n");
	}
}
