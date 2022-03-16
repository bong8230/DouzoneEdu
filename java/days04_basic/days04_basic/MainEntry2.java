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
			result = x/y;// 문제발생 있음
			System.out.println(result);
		}
		catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally는 무조건 출력");
		}
		
	}
}
