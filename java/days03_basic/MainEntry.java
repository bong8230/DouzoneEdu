package days03_basic;

public class MainEntry {
	public static void main(String[] args) {
// 	�ִܻ꽬��������
		
		
	 	//1.���׿����� : ���� ==> ++,--
//		int x = 10, y,k;
//		y= x++; //���������� : ���Ը���, ���곪��
//		y= ++x; //���������� : �������, ���Գ���
//		
//		System.out.println(y);
//      ==============================
//		//����������
//		int x = 10, y,k;
//		y= ~x;// -(x+1)
//		System.out.println(y);
		
 		//2.��������� : +,-,*,/,%....
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
//		//����
//		System.out.println("\n7/3="+(7/3)); // 2, ��
//		System.out.println("7%3="+(7%3)); // 1, ������
//		System.out.println("7.0/3.0="+(7./3.));
		
		//3.����Ʈ(shift)������ : >>, <<,<<<
//		int x=8,result;
//		 
//		result = x<<2; //left shift : ������ * 2^bit��
//		result = x>>3; //right shift : ������ / 2^bit��
//		System.out.println("left shift result: " + result); //32
//		System.out.println("right shift result: " + result); //1
		
		//4.���迬���� : >,<, >=, <=, ==(����), !=(�����ʴ�)
//		int x = 20, y=20;
//		if(x!=y)
//			System.out.println("�����ʽ��ϴ�.");
//		else
//			System.out.println("�����ϴ�.");
		
		
		//5. ���׿����� : (����)?��:����;
//		String msg = null;
//		msg = (x!=y)?"���� �ʽ��ϴ�.2" : "�����ϴ�.2";
//		System.out.println(msg);
//		
//		int a = 10, b = 20, c = 30, result;
//		result = (a>b)?a: (b>c)?b:c;
//		System.out.println(result);

		//6. �������� : &, &&(and), |, ||(or), ^(xor), !(not)
		//2�� �� ==> ����� , 10���� ==> ��� ��/����
//		int x = 4, y=7;
//		System.out.println(x & y); //4
//		System.out.println(x|y); //7
//		System.out.println(x^y); //3
//		
//		int a=10,b=20,c=30;
//		boolean result = true;
//
//		result = (a>b) && (b>c); //&&������ �տ� ���� �����̸� �ڴ� �������� �ʴ´�.
//		System.out.println(result);
//		
//		result = (a<b) && (b<c);
//		System.out.println(result);
//		
//		result = (a<b) || (b>c); //||������ �տ� ���� ���̸� �ڴ� ���� X
//		System.out.println(result);
//		
//		System.out.println(!result);

		
		//7. ���Կ�����: =, +=, -=, >>=, <<=, /=, %=,...
		
		int result, x=3, y=5;
		
		result = x+y;
		
		x = x+y;
		x += y;
		
		x = x*y;
		x *= y; // �ӵ��� 2�� ����!
	}
}
