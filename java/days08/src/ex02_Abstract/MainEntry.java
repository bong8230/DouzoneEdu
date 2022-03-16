package ex02_Abstract;

public class MainEntry {
	public static void main(String[] args) {

		// 1. 각자의 클래스로 객체 생성 형태
		Circle c = new Circle();
		c.show("원");

		Rect r = new Rect();
		r.show("Rectangle");

		Triangle t = new Triangle();
		t.show("삼각형");

		Shape s = new Circle();
		s.show("Circle");

		System.out.println("=========================");

		// 2. Shape 부모 추상클래스를 이용해서 객체 생성

		Shape sh = new Circle();
		sh.show("circle Circle");

		sh = new Rect();
		sh.show("Rect Rect");

		sh = new Triangle();
		sh.show("Triangle Triangle");

		System.out.println("=========================");

		// 3-1.
		Shape[] ss = new Shape[3]; // 배열 선언 및 생성
		// Shape ss = mew Shape(); //자체적으로 객체 생성 불가
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
