package days5_Quiz;

import java.util.Random;

//1월의 평균 강수량 구하는 프로그램 작성(단,30일 기준)
public class Array1Quiz002 {
	public static void main(String[] args) {
		Random random = new Random();
		int NUM = 30;
		int sum = 0;
		int[] arr = new int[NUM];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = random.nextInt(100);
			sum+=arr[i];
		}
		
		
		System.out.printf("1월 평균 강수량은 "+"%.2f"+"mm입니다.",(double)sum/arr.length);
	}
}
