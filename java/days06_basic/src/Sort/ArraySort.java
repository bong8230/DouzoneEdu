package Sort;

import java.util.Arrays;
//Array �Լ��� �̿��� ����0
public class ArraySort {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8};
		
		
		//before sort
		System.out.println("sort �� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		//sort ��������
		Arrays.sort(a);
		
		
		//sort ��������
		for (int i = a.length-1; i >=0; i--) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		//after sort
		System.out.println("sort �� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

			}
	}
}
