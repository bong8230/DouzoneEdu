package Sort;

public class BubleSort {
public static void main(String[] args) {
	int[] a = {7,3,5,2,8};
	int temp;
	
	//before sort
	System.out.println("sort 전 출력");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + "\t");
	}
	System.out.println();

	//sort
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-i-1; j++) {
			if(a[j]>a[j+1]) {
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	
	
	//after sort
	System.out.println("sort 후 출력");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + "\t");

		}
	}
}
