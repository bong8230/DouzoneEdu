package ex01_lambda;
// ���ʿ��� Ŭ������ ���ǵ� ����.
// �޼ҵ��� ���� Ÿ�Ե� ����, �̸��� ����
// Anonymous Function(�͸��Լ�) ==> �͸�Ŭ����
/*
ex))
	public int sum (int x, int y) { return x+y;}
	(x,y) -> {x+y}
*/

//parameter ����

interface Message{
	public void something(int x,int y);
}

interface Talk{
	public void something(String x,String y);
}

class Person{
	public void greeting(Message msg) {
		msg.something(88,99);
	}
	public void greeting(Talk msg) {
		msg.something("hihihihihihihihihihi","byebyebyebyebyebye");
	}
}

public class MainEntry4 {
	public static void main(String[] args) {
		Person p = new Person();
		
		
		//���ٸ� �̿����� ���� ��ҽ�Ÿ��(parameter ����)
		p.greeting(new Message() {
			@Override
			public void something(int x,int y) {
				System.out.println("parameter ����");
				System.out.println("parameter : " + x +","+y);
			}
		});
		
		System.out.println("=============================================");
		
		//���� ����(parameter ����)
		p.greeting( (String x, String y)->{ // �����̸��� �޼ҵ�, �������� �Ķ�����ϰ�� �ڷ���(Ÿ��) ǥ��
			System.out.println("parameter : " + x +","+y);
		});
		
		p.greeting( (int x, int y)->{ // �����̸��� �޼ҵ�, �������� �Ķ�����ϰ�� �ڷ���(Ÿ��) ǥ��
			System.out.println("parameter : " + x +","+y);
		});
	}
}

