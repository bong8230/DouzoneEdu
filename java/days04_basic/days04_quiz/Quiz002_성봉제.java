package days04_quiz;

import java.util.Scanner;

//����2 ����/��� �������α׷� �ۼ�
// if(year%4 ==0)
//		if(year%100 !=0) || if(year%400==0)
public class Quiz002_������ {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		String str=" ";
		boolean flag = false;
		System.out.print("������ �Է��ϼ���:");
		int year = num.nextInt();
		
		//�������ڵ�
		if((year%4==0)&&(year%100!=0 || year%400==0)) flag =true;
		
		str = (flag==true)? "����":"���";
		System.out.println(year + "�� ====> " + str);
		
//		//���ڵ�
//		if(year%4==0) {if(year%100 != 0 || year%400==0) System.out.println("����");}
//		else System.out.println("���");
			
	}
}
