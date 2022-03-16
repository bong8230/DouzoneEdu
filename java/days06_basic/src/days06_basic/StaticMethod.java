package days06_basic;

/*
 * static method : 객체 생성없이 바로 사용 가능
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
		A obj = new A(); //객체생성, 메모리할당
		int x = 9;
		int y = 11;
		obj.setData(11, 22); //object.methodName();
		A.setData(15, 17); //ClassName.methodName();
	}
}
