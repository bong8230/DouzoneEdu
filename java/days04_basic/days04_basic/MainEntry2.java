package days04_basic;

import java.util.Scanner;

/*
 *try~catch
 */


public class MainEntry2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x,y,result=0;
		
		System.out.printf("Integer data 2 input:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		try {
			result = x/y;// �����߻� ����
			System.out.println(result);
		}
		catch (Exception e) {
			System.out.println("0���� ������ �����ϴ�.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally�� ������ ���");
		}
		
	}
}
