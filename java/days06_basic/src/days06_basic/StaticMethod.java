package days06_basic;

/*
 * static method : ��ü �������� �ٷ� ��� ����
 * object.methodName();
 * ClassName.methodName();
 */
class A{
	int x,y;
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx+", "+ yy);
	}
}//A class end

public class StaticMethod {
	public static void main(String[] args) {
		A obj = new A(); //��ü����, �޸��Ҵ�
		int x = 9;
		int y = 11;
		obj.setData(11, 22); //object.methodName();
		A.setData(15, 17); //ClassName.methodName();
	}
}
