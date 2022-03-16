package days04_basic;

import java.util.Scanner;

public class SwitchGrade {
	public static void main(String[] args) {
		//성적표 국어,영어,전산,이름 입력 받아서 총점, 평균
				
				Scanner score = new Scanner(System.in);
				
				System.out.println("이름을 입력하세요");
				String name = score.nextLine();
				System.out.print("국어:");
				int kor = score.nextInt();	
				System.out.print("영어:");
				int eng = score.nextInt();
				System.out.print("전산:");
				int pc = score.nextInt();
				
				
				int sum = (kor+eng+pc);
				double avg = sum/3.0;
				
				String grade;
				//학점(평점):A~F학점
				switch((int)avg/10) {
					case 10 : 
					case 9 : grade ="A"; break;   
					case 8 : grade ="B"; break;
					case 7 : grade ="C"; break;
					case 6 : grade ="D"; break;
					default : grade ="F";
				}
				
			
				System.out.println("이름: "+ name);
				System.out.printf( "총점: "+ sum + "\n" +
								   "평균: %.2f" + "\n" +
								   "학점: "+ grade + "\n",avg);
	}
}
