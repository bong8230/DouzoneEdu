package days06_basic;
/*
 * instance method : ��ü�����ϰ� ����ؾ���
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
		B b = new B(); // ��ü ����
		b.setData(20, 50); // ��ü�θ� ����� ������
		//B.setData(20, 30); // ���Ұ�
	}
}
