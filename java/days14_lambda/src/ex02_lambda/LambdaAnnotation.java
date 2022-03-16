package ex02_lambda;

interface Plus{
	int sum(int x, int y);
}

public class LambdaAnnotation {
	public static void main(String[] args) {
		Plus num = (x,y)-> x+y;
		System.out.println(num.sum(3, 5));
	}
}
