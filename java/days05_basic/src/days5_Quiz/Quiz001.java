package days5_Quiz;

//과제1
//과제2
//과제3

public class Quiz001 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				 sum +=j;
			}
		}
		System.out.println(sum);
	}
}
