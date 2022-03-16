package days06_basic;
/*
 * instance method : 객체생성하고 사용해야함
 */
class B{
	int x,y;
	
	//instance method
	public void setData(int xx, int yy) {
		System.out.println(xx+", "+ yy);
	}
}

public class InstanceMethodEx {
	public static void main(String[] args) {
		B b = new B(); // 객체 생성
		b.setData(20, 50); // 객체로만 사용이 가능함
		//B.setData(20, 30); // 사용불가
	}
}
