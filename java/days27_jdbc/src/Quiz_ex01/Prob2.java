package Quiz_ex01;


public class Prob2 {
	public static void main(String[] args) {
		int num = generateRandom();
		System.out.println("������ ���� : " + num);
		if (primeNumber(num)) {
			System.out.println("---> �Ҽ��Դϴ�.");
		} else {
			System.out.println("---> �Ҽ��� �ƴմϴ�.");
		}
	}

	private static int generateRandom() {
		int num = (int)(Math.random()*100) +1;
		return num;
	}

	private static boolean primeNumber(int num) {
		if(num<=1) return false;
		for (int i = 2; i <= num; i++) {
			if(num%2==0) return false;
		}
		return true;
	}
}