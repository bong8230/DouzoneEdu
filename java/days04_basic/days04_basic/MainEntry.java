package days04_basic;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("Integer data input: ");
		int su = new Scanner(System.in).nextInt();
		
		//¦,Ȧ�� ���� if
		if(su%2 ==0) System.out.println("even");
		else System.out.println("odd");
		
		System.out.println("======================================");
		
		//���, ����, 0 ���� if
		if(su>0) System.out.println("���");
		else if(su<0) System.out.println("����");
		else System.out.println("0");
	}
}
