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
//	public int something(int x,int y);
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something(88,99);
//		System.out.println("number" + su);
//	}
//}
//
//public class MainEntry3 {
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		
//		//람다를 이용하지 않은 평소스타일(parameter 예제)
//		p.greeting(new Message() {
//			@Override
//			public int something(int x,int y) {
//				System.out.println("parameter 예제");
//				System.out.println("parameter : " + x +","+y);
//				return 300;
//			}
//		});
//		
//		System.out.println("=============================================");
//		
//		//람다 적용(parameter 예제)
//		p.greeting( (x,y)->{ // 매개변수가 2개이상이면 괄호생략 불가능
//			System.out.println("parameter : " + x +","+y);
//			return 200;
//		});
//	}
//}
//
