package ex02_Abstract;

public class Rect extends Shape {
	int h =10;
	@Override
	public double calc(double x) {
		result = x*h;
		return result;
	}

	@Override
	public void show(String name) {
		calc(8);
		System.out.println(result + " ũ���� " + name + "�� �׷������ϴ�.");
	}

}