//package ex01_lambda;
//// ���ʿ��� Ŭ������ ���ǵ� ����.
//// �޼ҵ��� ���� Ÿ�Ե� ����, �̸��� ����
//// Anonymous Function(�͸��Լ�) ==> �͸�Ŭ����
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
//		//���ٸ� �̿����� ���� ��ҽ�Ÿ��
//		p.greeting(new Message() {
//			@Override
//			public int something() {
//				return 2;
//			}
//		});
//		
//		System.out.println("=============================================");
//		//���� ����
//		
//		p.greeting( ()->{
//			return 20;
//		});
//	}
//}
//
