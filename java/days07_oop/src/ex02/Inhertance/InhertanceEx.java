package ex02.Inhertance;

/*Inhertance(���)
- extends
- ���� ��Ӹ� ����
- super
- ����
- Ȯ��
*/

/*Constructor(������) �Լ�
- Ŭ������� �����ϴ�
- ����Ÿ�� ����(void ���� ������� ����)
- �ߺ����� ������(overload���� - �ߺ��Լ�)
- default constructor ����������
- ����� ������� �ʱ�ȭ
*/
/*
 * this : ��ü�ڽ��� ����
 * this() : �޼ҵ� --> �ݵ�� ù�ٿ� ��ġ�ؾ���
 * super : �θ�ü�� ����
 * super():�θ� �޼��� ���� --> �ݵ�� ù�ٿ� ��ġ�ؾ���
 */


public class InhertanceEx {
	public static void main(String[] args) {
		Circle c = new Circle();
		//c.disp();
		c.toString();
		
		Rect r = new Rect();
		//r.disp();
		r.toString();
		Point pt = new Point();
		pt.toString();
//		pt.disp();System.out.println();
//		Point pt2 = new Point(1,2);
//		pt2.disp();
//		Point pt3 = new Point(300);
//		pt3.disp();
	}
}
