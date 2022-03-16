package ex02.Inhertance;

class Point{ //public은 main 메소드가 있는곳에만 선언이 가능함
	protected int x; // 멤버변수
	protected int y;
	
	public Point() { //생성자함수
		this(3,5);
		x=y=20;
		System.out.println("Point default");
	}
	public Point(int x) { //1
		this.x = x;
		y = 9;
		System.out.println("Point 1");
	}
	public Point(int x, int y) { //2
		this.x = x;
		this.y = y;
		System.out.println("Point 2");
	}
	
	//getter /setter method
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
//	public String toString() {
//		String str = "x:\t " + x + "\t y:"+y;
//		return str;
//	}
	//user method - output
//	public void disp() {
//		System.out.println("x:"+x+","+"y:"+y);
//	}
}