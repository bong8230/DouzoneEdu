package days04_quiz;

import java.util.Scanner;

//����3 ���ϴ� ���� �Է� �޾Ƽ� ������ ����ϴ� ���α׷� �ۼ�

public class Quiz006_������ {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("���Ͻô� ���� �Է��ϼ���(1~9):");
		int num = n.nextInt();
		gugudan(num);
	}
	
	public static void gugudan(int num) {
		System.out.println(num+"��");
		for(int i=1;i<10;i++) {
			System.out.printf(num + "*" + i + "= %d \n",num*i);
		}
	}
}
