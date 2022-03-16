package days04_basic;

public class For {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if(i%10==0) System.out.println();
			System.out.print((i+1)+"\t");
		}
	}
}

//문제 1~300까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성