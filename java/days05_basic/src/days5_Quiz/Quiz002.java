package days5_Quiz;

public class Quiz002 {
	public static void main(String[] args) {
		
		int sum =0;
		
		for(int j=1;j<=10;j++) {
			if(j%2==0) sum+=j;
			else sum+= -j;
			}
		System.out.println(sum);
	}
}
