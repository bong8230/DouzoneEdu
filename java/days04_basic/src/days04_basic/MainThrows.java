package days04_basic;

import java.util.Scanner;

/*
 *try~catch : ����ó�� - ����
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

		result = x / y;	// �����߻� ����
		System.out.println(result);

	}
}
