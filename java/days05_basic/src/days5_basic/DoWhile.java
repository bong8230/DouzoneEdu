package days5_basic;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int su = n.nextInt();
		
		do {
			System.out.println(su);
		}while(su>=0 && su<=100);
	}
}
