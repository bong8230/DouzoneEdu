package Quiz_ex01;


public class Prob2 {
	public static void main(String[] args) {
		int num = generateRandom();
		System.out.println("생성된 정수 : " + num);
		if (primeNumber(num)) {
			System.out.println("---> 소수입니다.");
		} else {
			System.out.println("---> 소수가 아닙니다.");
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