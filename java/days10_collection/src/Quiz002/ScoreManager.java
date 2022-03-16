package Quiz002;

import java.util.ArrayList;
import java.util.Scanner;



public class ScoreManager extends Score {
	static ArrayList<Score> score = new ArrayList<Score>();
	static Score vv = new Score(); 
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("점수관리를 시작합니다. \n1.입력 \n2.수정 \n3.삭제 \n4.리스트\n5.종료\n");
	}
	
	public static void input() {
		
		System.out.print("이름을 입력 : ");
		String name = sc.next();
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("전산점수 입력 : ");
		int pc = sc.nextInt();
		
		score.add(new Score(name,kor,eng,pc));
		System.out.println("저장되었습니다. 처음으로 돌아갑니다.");
	}
	
	public static void update() {
		System.out.println("현재 " + score.size() + "건의 학생정보가 있습니다.");
		System.out.print("몇번째 학생을 수정하시겠습니까? (숫자입력)");
		int n = sc.nextInt();
		System.out.println("현재 " + n + "번째 학생의 정보입니다.");
		System.out.println("[" + n + "]번째\n" + "이름 : " + score.get(n-1).getName());
		System.out.println("국어점수 : " + score.get(n-1).getKor());
		System.out.println("영어점수 : " + score.get(n-1).getEng());
		System.out.println("전산점수 : " + score.get(n-1).getPc());
		System.out.println("===========================");
		
		System.out.println("수정할 학생의 정보를 입력해주세요");
		String name = score.get(n-1).getName();
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("전산점수 입력 : ");
		int pc = sc.nextInt();
		
		score.set(n-1, new Score(name,kor,eng,pc));
	}
	
	public static void delete() {
		System.out.print("삭제할 학생정보의 번호를 입력해주세요");
		int k = sc.nextInt();
		score.remove(k - 1);
		System.out.println(k + "번째 학생의 정보가 삭제되었습니다. 처음으로 돌아갑니다.");
	}
	
	public static void show() {
		System.out.println("===========================");
		for (int i = 0; i < score.size(); i++) {
			System.out.println("[" + (i + 1) + "]번째\n" + "이름 : " + score.get(i).getName());
			System.out.println("국어점수 : " + score.get(i).getKor());
			System.out.println("영어점수 : " + score.get(i).getEng());
			System.out.println("전산점수 : " + score.get(i).getPc());
			System.out.println("총 점수 : " + score.get(i).total );
			System.out.println("평균점수 : " + score.get(i).average);
			grade(score.get(i).average);
			System.out.println("===========================");
		}
	}
	
	public static void grade(double average) {
		if(average>=90) System.out.println("학점 : A");
		else if(average>=80) System.out.println("학점 : B"); 
		else if(average>=70) System.out.println("학점 : C");
		else if(average>=60) System.out.println("학점 : D");
		else System.out.println("학점 : F");
	}
	
}
