package days04_quiz;

import java.util.Scanner;
//����1
//������,��ȯ�˰���,if�̿�
//�������� ����
// 3 6 4  ==>  6>4>3���� ���
public class Quiz004_������ {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int[] arr = new int[5];//�迭 ����

		System.out.print("5���� ���ڸ� �Է��ϼ���:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=num.nextInt();//�迭 ����
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
