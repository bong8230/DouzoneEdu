package days5_Quiz;

public class Quiz003 {
	public static void main(String[] args) {
		double sum =0;
		for(double i=1;i<10;i++) {
			for(double j=i+1;j<=i+1;j++) {
				sum+=i/j;
			}
		}
		System.out.println(sum);
	}
}
