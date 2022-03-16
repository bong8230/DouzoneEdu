package ex06.Random;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		Random r = new Random();
//		for(int i =0; i<6; i++) {
//			System.out.print(r.nextInt(45) + " "); // 0~44
//		}
		System.out.println();
		for(int i =0; i<6; i++) {
			System.out.print((r.nextInt(45)+1) + " "); // 1~45
		}
	}
}
