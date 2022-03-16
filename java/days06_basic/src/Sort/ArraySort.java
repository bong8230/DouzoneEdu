package Sort;

import java.util.Arrays;
//Array 함수를 이용한 정렬0
public class ArraySort {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8};
		
		
		//before sort
		System.out.println("sort 전 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		//sort 오름차순
		Arrays.sort(a);
		
		
		//sort 내림차순
		for (int i = a.length-1; i >=0; i--) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		//after sort
		System.out.println("sort 후 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

			}
	}
}
