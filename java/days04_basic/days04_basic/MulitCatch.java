package days04_basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *try~catch : 직접처리 - 권장
 *throws
 *throw
 */


public class MulitCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x,y,result=0;
		
		System.out.printf("Integer data 2 input:");
		
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x/y;// 문제발생 있음
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException!!!");//하위예외
		}catch (InputMismatchException e) {
			System.out.println("InputMismatchException!!!");
		}/*catch(RuntimeException e){
			System.out.println("RuntimeException!!!");
		}*/catch(Exception e){
			System.out.println("Exception !!!");
		}		finally {
			System.out.println("finally는 무조건 출력");
		}
		
	}
}
