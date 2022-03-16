//package ex01_lambda;
//// 불필요한 클래스의 정의도 없다.
//// 메소드의 리턴 타입도 없고, 이름도 없다
//// Anonymous Function(익명함수) ==> 익명클래스
///*
//ex))
//	public int sum (int x, int y) { return x+y;}
//	(x,y) -> {x+y}
//*/
//
////parameter 예제
//
//interface Message{
//	public int something(int x);
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something(88);
//		System.out.println("number" + su);
//	}
//}
//
//public class MainEntry2 {
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		
//		//람다를 이용하지 않은 평소스타일(parameter 예제)
//		p.greeting(new Message() {
//			@Override
//			public int something(int x) {
//				System.out.println("parameter 예제");
//				System.out.println("parameter : " + x);
//				return 30;
//			}
//		});
//		
//		System.out.println("=============================================");
//		
//		//람다 적용(parameter 예제)
//		p.greeting( x->{ // int x 처럼 타입 안써도되고 괄호도 생략가능
//			System.out.println("parameter : " + x);
//			return 20;
//		});
//	}
//}
//
