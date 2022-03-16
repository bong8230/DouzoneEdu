package ex06.Random;

public class MathRandom {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println();
		System.out.println(Math.random());
		//0~n-1°ªÃâ·Â
		System.out.println(Math.random()*5);// 0 ~ 4
		System.out.println((Math.random()*5) + 1); // 1~5
		
		System.out.println();
		for (int i = 1; i < 7; i++) {
			System.out.print((int)(Math.random()*45)+1 +" ");// 1 ~ 45
		}
	}
}
