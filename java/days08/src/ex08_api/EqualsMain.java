package ex08_api;

class Circle{
	int x,y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		int x=3, y=3;
		System.out.println("�⺻ �ڷ��� ��");
		if( x==y) System.out.println("����");
		else System.out.println("�ٸ���");
		
		System.out.println("�����ڷ��� ��");
		String str1 = new String("kosa");
		String str2 = new String("kosa");
		
		if(str1 == str2) System.out.println("����");
		else System.out.println("�ٸ���");
		
		if(str1.equals(str2)) System.out.println("����");
		else System.out.println("�ٸ���");
		
		if(str1.contentEquals(str2)) System.out.println("����");
		else System.out.println("�ٸ���");
		
		if(str1.equalsIgnoreCase(str2)) System.out.println("����");
		else System.out.println("�ٸ���");
		
	}
}
