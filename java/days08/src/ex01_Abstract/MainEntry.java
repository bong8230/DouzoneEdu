package ex01_Abstract;

abstract class Shape { // �߻�Ŭ����, Super class
	double result = 0;

	public abstract double calc();

	public abstract void draw();

	public void show() {
		System.out.println("Super class Shape");
	}
} // Shaple end

class Circle extends Shape {
	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		
		System.out.println("���� ���� : " + result + "�� ���� �׷Ƚ��ϴ�.");
	}
	
	public void disp() {}

} // Circle end

class Triangle extends Shape{
	int x = 5;
	int y = 7;
	@Override
	public double calc() {
		result = x * y * 0.5;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("�ﰢ���� ���� : " + result + "�� �ﰢ���� �׷Ƚ��ϴ�.");
	}
}

public class MainEntry {
	public static void main(String[] args) {
		//Shape sh = new Shape (); // �߻�Ŭ������ ��ü������ ��ü �����Ҽ� ����
		Shape sh = new Circle(); // ��� ���� �ڼ� Ŭ�����δ� ��ü ���� �� ���ִ�.
		sh.draw();
		Shape st = new Triangle();
		st.draw();
		
		Circle r = new Circle();
		r.draw();
		
		Triangle t = new Triangle();
		t.draw();
	}
}
