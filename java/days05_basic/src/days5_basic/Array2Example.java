package days5_basic;

import java.util.Scanner;

public class Array2Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int[][] arr = new int[2][3];
		
		
//		int x = sc.nextInt();
//		System.out.println("x =" + x);
		
		//input
		System.out.print("array data 2row, 3col : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}//input end
		System.out.println();
		//output
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}//output end*/
		
		int[][] arr2 = new int[3][4];
		
		//1,2�� ������ ����
		for(int i=0;i<arr2.length-1;i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print("arr2"+"["+i+"]"+"["+j+"]�� �Է��� ���� :");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		//3�� �� ����Ͽ� ����
		for(int i=0;i<arr2.length;i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if(i<1) arr2[2][j] = arr2[i][j] + arr2[i+1][j];
			}
		}
		System.out.println();
		
		//���
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
