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
////parameter ����
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
//		//���ٸ� �̿����� ���� ��ҽ�Ÿ��(parameter ����)
//		p.greeting(new Message() {
//			@Override
//			public int something(int x) {
//				System.out.println("parameter ����");
//				System.out.println("parameter : " + x);
//				return 30;
//			}
//		});
//		
//		System.out.println("=============================================");
//		
//		//���� ����(parameter ����)
//		p.greeting( x->{ // int x ó�� Ÿ�� �Ƚᵵ�ǰ� ��ȣ�� ��������
//			System.out.println("parameter : " + x);
//			return 20;
//		});
//	}
//}
//
