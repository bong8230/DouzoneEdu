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
//interface Message{
//	public int something();
//}
//
//class Person{
//	public void greeting(Message msg) {
//		msg.something();
//		System.out.println("number" + msg.something());
//	}
//}
//
//public class MainEntry {
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		
//		//람다를 이용하지 않은 평소스타일
//		p.greeting(new Message() {
//			@Override
//			public int something() {
//				return 2;
//			}
//		});
//		
//		System.out.println("=============================================");
//		//람다 적용
//		
//		p.greeting( ()->{
//			return 20;
//		});
//	}
//}
//
