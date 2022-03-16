package Quiz002;

import java.util.ArrayList;
import java.util.Scanner;



public class ScoreManager extends Score {
	static ArrayList<Score> score = new ArrayList<Score>();
	static Score vv = new Score(); 
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("���������� �����մϴ�. \n1.�Է� \n2.���� \n3.���� \n4.����Ʈ\n5.����\n");
	}
	
	public static void input() {
		
		System.out.print("�̸��� �Է� : ");
		String name = sc.next();
		System.out.print("�������� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int pc = sc.nextInt();
		
		score.add(new Score(name,kor,eng,pc));
		System.out.println("����Ǿ����ϴ�. ó������ ���ư��ϴ�.");
	}
	
	public static void update() {
		System.out.println("���� " + score.size() + "���� �л������� �ֽ��ϴ�.");
		System.out.print("���° �л��� �����Ͻðڽ��ϱ�? (�����Է�)");
		int n = sc.nextInt();
		System.out.println("���� " + n + "��° �л��� �����Դϴ�.");
		System.out.println("[" + n + "]��°\n" + "�̸� : " + score.get(n-1).getName());
		System.out.println("�������� : " + score.get(n-1).getKor());
		System.out.println("�������� : " + score.get(n-1).getEng());
		System.out.println("�������� : " + score.get(n-1).getPc());
		System.out.println("===========================");
		
		System.out.println("������ �л��� ������ �Է����ּ���");
		String name = score.get(n-1).getName();
		System.out.print("�������� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int pc = sc.nextInt();
		
		score.set(n-1, new Score(name,kor,eng,pc));
	}
	
	public static void delete() {
		System.out.print("������ �л������� ��ȣ�� �Է����ּ���");
		int k = sc.nextInt();
		score.remove(k - 1);
		System.out.println(k + "��° �л��� ������ �����Ǿ����ϴ�. ó������ ���ư��ϴ�.");
	}
	
	public static void show() {
		System.out.println("===========================");
		for (int i = 0; i < score.size(); i++) {
			System.out.println("[" + (i + 1) + "]��°\n" + "�̸� : " + score.get(i).getName());
			System.out.println("�������� : " + score.get(i).getKor());
			System.out.println("�������� : " + score.get(i).getEng());
			System.out.println("�������� : " + score.get(i).getPc());
			System.out.println("�� ���� : " + score.get(i).total );
			System.out.println("������� : " + score.get(i).average);
			grade(score.get(i).average);
			System.out.println("===========================");
		}
	}
	
	public static void grade(double average) {
		if(average>=90) System.out.println("���� : A");
		else if(average>=80) System.out.println("���� : B"); 
		else if(average>=70) System.out.println("���� : C");
		else if(average>=60) System.out.println("���� : D");
		else System.out.println("���� : F");
	}
	
}
