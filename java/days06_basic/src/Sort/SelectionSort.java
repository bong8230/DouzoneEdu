package Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8};
		int temp;
		
		//before sort
		System.out.println("sort �� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		//after sort
		System.out.println("sort �� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
