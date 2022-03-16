package ex02_Abstract;

public abstract class Shape {
	double result = 0;
	public abstract double calc(double x); // 추상메소드 abstract method
	public abstract void show(String name); // // 추상메소드 abstract method
	public void view() {
		System.out.println("Super class Shape");
	}
}
