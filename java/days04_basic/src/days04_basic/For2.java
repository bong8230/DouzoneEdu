package days04_basic;

//���� 1~100���� �߿��� 3�� ����� ������ ���� ���ϴ� ���α׷� �ۼ�
public class For2 {
	public static void main(String[] args) {
		int cnt=0,sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println("����� �� : " + sum +"\n" + "���� : " + cnt);
	}
}
