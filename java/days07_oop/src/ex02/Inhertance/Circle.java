package ex02.Inhertance;

public class Circle extends Point {
	private int r;

	
	public Circle() {
		x=y=10;
		System.out.println("Circle default");
	}
	
	public Circle(int x) {
		this.x = x;
		System.out.println("Circle 1");
	}
	
	public Circle(int x, int y) {
		super(x,y);
		System.out.println("Circle 2");
	}
	
	public Circle(int x, int y, int r) {
		this.r = 13;
		System.out.println("Circle 3");
	}
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + ", getR()=" + getR() + ", getX()=" + getX() + ", getY()="
				+ getY() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	//output method
//	public void disp() {
//		//super.disp();
//		System.out.println("x:"+ x +","+"y:"+ y +"r :"+ r);
//	}
}
