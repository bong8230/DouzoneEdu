package ex02_Abstract;

public class MainEntry {
	public static void main(String[] args) {

		// 1. ������ Ŭ������ ��ü ���� ����
		Circle c = new Circle();
		c.show("��");

		Rect r = new Rect();
		r.show("Rectangle");

		Triangle t = new Triangle();
		t.show("�ﰢ��");

		Shape s = new Circle();
		s.show("Circle");

		System.out.println("=========================");

		// 2. Shape �θ� �߻�Ŭ������ �̿��ؼ� ��ü ����

		Shape sh = new Circle();
		sh.show("circle Circle");

		sh = new Rect();
		sh.show("Rect Rect");

		sh = new Triangle();
		sh.show("Triangle Triangle");

		System.out.println("=========================");

		// 3-1.
		Shape[] ss = new Shape[3]; // �迭 ���� �� ����
		// Shape ss = mew Shape(); //��ü������ ��ü ���� �Ұ�
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		String[] name = { "Circle", "Rect", "Triangle" };

		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		System.out.println("=========================");
		System.out.println("=========================");
		
		
		// 3-2.
		Shape[] dd = new Shape[3];
		Object[] shape = { new Circle(), new Rect(), new Triangle() };
		for (int i = 0; i < dd.length; i++) {
			dd[i] = (Shape) shape[i];
			dd[i].show(name[i]);
		}
	}
}
