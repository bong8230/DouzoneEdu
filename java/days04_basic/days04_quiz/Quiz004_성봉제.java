package days04_quiz;

import java.util.Scanner;
//과제1
//논리연산,교환알고리즘,if이용
//내림차순 정렬
// 3 6 4  ==>  6>4>3으로 출력
public class Quiz004_성봉제 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int[] arr = new int[5];//배열 생성

		System.out.print("5개의 숫자를 입력하세요:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=num.nextInt();//배열 삽입
		}
		
		int a;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]<arr[j]) {
				a = arr[j];
				arr[j] = arr[i];
				arr[i] = a;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
		
	}
}
