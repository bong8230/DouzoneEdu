package days04_basic;

import java.util.Scanner;

/*
 *try~catch : 流立贸府 - 鼻厘
 *throws :
 *throw
 */

public class MainThrows {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;

		System.out.printf("Integer data 2 input:");
		x = sc.nextInt();
		y = sc.nextInt();

		result = x / y;	// 巩力惯积 乐澜
		System.out.println(result);

	}
}
