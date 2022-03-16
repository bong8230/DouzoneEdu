package days04_basic;

//문제 1~100까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성
public class For2 {
	public static void main(String[] args) {
		int cnt=0,sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println("배수의 합 : " + sum +"\n" + "개수 : " + cnt);
	}
}
