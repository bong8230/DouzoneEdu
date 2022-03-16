package ex01_Abstract;

abstract class Shape { // 추상클래스, Super class
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
		
		System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");
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
		System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");
	}
}

public class MainEntry {
	public static void main(String[] args) {
		//Shape sh = new Shape (); // 추상클래스는 자체적으로 객체 생성할수 없음
		Shape sh = new Circle(); // 상속 받은 자손 클래스로는 객체 생성 할 수있다.
		sh.draw();
		Shape st = new Triangle();
		st.draw();
		
		Circle r = new Circle();
		r.draw();
		
		Triangle t = new Triangle();
		t.draw();
	}
}
