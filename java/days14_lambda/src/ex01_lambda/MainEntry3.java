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
//		//���ٸ� �̿����� ���� ��ҽ�Ÿ��(parameter ����)
//		p.greeting(new Message() {
//			@Override
//			public int something(int x,int y) {
//				System.out.println("parameter ����");
//				System.out.println("parameter : " + x +","+y);
//				return 300;
//			}
//		});
//		
//		System.out.println("=============================================");
//		
//		//���� ����(parameter ����)
//		p.greeting( (x,y)->{ // �Ű������� 2���̻��̸� ��ȣ���� �Ұ���
//			System.out.println("parameter : " + x +","+y);
//			return 200;
//		});
//	}
//}
//
