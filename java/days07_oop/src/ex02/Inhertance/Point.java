package ex02.Inhertance;

class Point{ //public�� main �޼ҵ尡 �ִ°����� ������ ������
	protected int x; // �������
	protected int y;
	
	public Point() { //�������Լ�
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