package days5_Quiz;

import java.util.Random;

//1���� ��� ������ ���ϴ� ���α׷� �ۼ�(��,30�� ����)
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
		
		
		System.out.printf("1�� ��� �������� "+"%.2f"+"mm�Դϴ�.",(double)sum/arr.length);
	}
}
