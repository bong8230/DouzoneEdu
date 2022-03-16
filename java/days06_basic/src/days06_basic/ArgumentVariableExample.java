package days06_basic;
//가변길이
public class ArgumentVariableExample {
	
	public static void plus(int...x) {//가변길이 배열
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println();
		//System.out.println("sum = "+ sum);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " + ");
//			else if(x.length<i+1) System.out.print(" = ");
		}System.out.print(sum);
	}
	
	public static void main(String[] args) {
		plus(3);
		plus(1,2,3,4,5,5,6,7);
		plus(100,20);
	}
}
