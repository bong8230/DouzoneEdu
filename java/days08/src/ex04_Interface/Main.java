package ex04_Interface;

import ex02_Abstract.Shape;

public class Main {
	public static void main(String[] args) {
		//2.super
		
		Shape s = new MultiClass();
		s.calc(5.5);
		s.show("도형이야");
		s.view();
		
		System.out.println("==================");
		
		Test t= new MultiClass();
		t.tView();
		System.out.println(t.str);
		
		
		//1.
		MultiClass mc = new MultiClass();
		mc.draw();
		System.out.println(mc.su);
		System.err.println(mc.num);
	}
}
