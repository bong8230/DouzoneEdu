package ex02_Abstract;

public abstract class Shape {
	double result = 0;
	public abstract double calc(double x); // �߻�޼ҵ� abstract method
	public abstract void show(String name); // // �߻�޼ҵ� abstract method
	public void view() {
		System.out.println("Super class Shape");
	}
}
