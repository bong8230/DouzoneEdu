package Sort;

public class ForEach {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8,100,89,90};
		
		System.out.println("for출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			if(i==3) break;
		}
		System.out.println();
		
		
		//for(자료형 변수명 : 컬렉션명 or 배열명){ 반복구문 }
		System.out.println("for each 출력");
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.println();
	}
}
