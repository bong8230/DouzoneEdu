package Sort;

public class ForEach {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8,100,89,90};
		
		System.out.println("for���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			if(i==3) break;
		}
		System.out.println();
		
		
		//for(�ڷ��� ������ : �÷��Ǹ� or �迭��){ �ݺ����� }
		System.out.println("for each ���");
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.println();
	}
}
