package ex04_Interface;

import ex02_Abstract.Shape;
import ex05_Interface.IDraw;

public class MultiClass extends Shape implements IDraw, Test {

	@Override
	public void draw() {
		System.out.println("idraw interface");
	}

	@Override
	public void tView() {
		System.out.println("test interface");
	}
	
	@Override
	public double calc(double x) {
		System.out.println("shape class");
		return 1000;
	}

	@Override
	public void show(String name) {
		System.out.println(name);
	}

	
}
