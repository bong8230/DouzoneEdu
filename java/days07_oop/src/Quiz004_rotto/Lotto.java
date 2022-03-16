package Quiz004_rotto;

import java.util.Arrays;

//1~45�����߿��� 6�� ���(�ߺ� ����)
public class Lotto {
	public static void main(String[] args) {
		lotto();
	}
	
	public static void lotto() {
		int[] a = new int[6];
		for (int i = 0; i < a.length; i++) {
			a[i]=((int)(Math.random()*45)+1);
			for (int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
