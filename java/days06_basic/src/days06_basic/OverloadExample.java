package days06_basic;
//�����ε�
public class OverloadExample {
	public static void line() {
		System.out.println("--------------------");
	}
	public static void line(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.println("=====================");
		}
	}
	
	public static void line(String str, int n) {
		for (int i = 1; i <=n; i++) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	public static void line(int x, int n) {
		for (int i = x; i <= n; i++) {
			System.out.print("+");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		line();
		line("*",10);
		line(3,5);
		line(5,3);// �������� �ذ��Ұ�
		line(-30);// �������� �ذ��Ұ�
	}
}
