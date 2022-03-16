package days03_basic;

public class MainEntry {
	public static void main(String[] args) {
// 	최단산쉬관논삼대콤
		
		
	 	//1.단항연산자 : 증감 ==> ++,--
//		int x = 10, y,k;
//		y= x++; //후위연산자 : 대입먼저, 연산나중
//		y= ++x; //전위연산자 : 연산먼저, 대입나중
//		
//		System.out.println(y);
//      ==============================
//		//부정연산자
//		int x = 10, y,k;
//		y= ~x;// -(x+1)
//		System.out.println(y);
		
 		//2.산술연산자 : +,-,*,/,%....
//		int x = 10, y= 20;
//		int gob = x*y;
//		
//		System.out.println("x*y="+gob);
//		System.out.println("x*y="+(x*y));
//		
//		System.out.println(x+"*"+y+"="+(x*y));
//		
//		System.out.println("\n\n3+4*5=" +(3+4*5));
//		System.out.println("3+4*5="+((3+4)*5));
//		
//		//정수
//		System.out.println("\n7/3="+(7/3)); // 2, 몫
//		System.out.println("7%3="+(7%3)); // 1, 나머지
//		System.out.println("7.0/3.0="+(7./3.));
		
		//3.시프트(shift)연산자 : >>, <<,<<<
//		int x=8,result;
//		 
//		result = x<<2; //left shift : 원래값 * 2^bit수
//		result = x>>3; //right shift : 원래값 / 2^bit수
//		System.out.println("left shift result: " + result); //32
//		System.out.println("right shift result: " + result); //1
		
		//4.관계연산자 : >,<, >=, <=, ==(같다), !=(같지않다)
//		int x = 20, y=20;
//		if(x!=y)
//			System.out.println("같지않습니다.");
//		else
//			System.out.println("같습니다.");
		
		
		//5. 삼항연산자 : (조건)?참:거짓;
//		String msg = null;
//		msg = (x!=y)?"같지 않습니다.2" : "같습니다.2";
//		System.out.println(msg);
//		
//		int a = 10, b = 20, c = 30, result;
//		result = (a>b)?a: (b>c)?b:c;
//		System.out.println(result);

		//6. 논리연산자 : &, &&(and), |, ||(or), ^(xor), !(not)
		//2진 논리 ==> 결과값 , 10진논리 ==> 결과 참/거짓
//		int x = 4, y=7;
//		System.out.println(x & y); //4
//		System.out.println(x|y); //7
//		System.out.println(x^y); //3
//		
//		int a=10,b=20,c=30;
//		boolean result = true;
//
//		result = (a>b) && (b>c); //&&연산은 앞에 것이 거짓이면 뒤는 수행하지 않는다.
//		System.out.println(result);
//		
//		result = (a<b) && (b<c);
//		System.out.println(result);
//		
//		result = (a<b) || (b>c); //||연산은 앞에 것이 참이면 뒤는 수행 X
//		System.out.println(result);
//		
//		System.out.println(!result);

		
		//7. 대입연산자: =, +=, -=, >>=, <<=, /=, %=,...
		
		int result, x=3, y=5;
		
		result = x+y;
		
		x = x+y;
		x += y;
		
		x = x*y;
		x *= y; // 속도가 2배 빠름!
	}
}
