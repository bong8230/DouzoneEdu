package Quiz003_UpDown;

import java.util.Scanner;

//�����̿�
//1~100�����߿��� ������ ���� ����
// ����ڴ� 5���� ��ȸ�� �༭ �Է�
// �� �Է� ���� ���ڿ� ������ ������ �������� �����ϴ� ���α׷� �ۼ�;
public class UpDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("@@@@@@@ Up & Down @@@@@@@");
		int r = (int)(Math.random()*100)+1;
		int cnt=0;
		System.out.println("������ ���ڰ� ���������ϴ�!");
		System.out.println("1~100�� ������ ���ڸ� 5���� ��ȸ���� ���纸����!");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("���ڸ� �Է��ϼ��� : "); int answer = sc.nextInt();
			if(r == answer) { 
				System.out.println();
				System.out.println("������ " + r +"�� �½��ϴ�~!! ��������!!");
				break;//�¸�
			}
			else if(r>answer) { System.out.println("UPUP!!"); cnt++; } 
			else if(r<answer) { System.out.println("DownDown!!"); cnt++; }
		}
		//�й�
		if(cnt==5) System.out.println("������ " + r + "�̿����ϴ� �Ф�");
	}
}
