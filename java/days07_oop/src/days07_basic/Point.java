package days07_basic;

class Point{ //public�� main �޼ҵ尡 �ִ°����� ������ ������
	private int x,y; // �������
	
	//getter /setter method
	public int getX() { return x;}
	public void setX(int xx) {x=xx;}
	
	public int getY() { return y;}
	public void setY(int yy) {y=yy;}
	
	//user method - output
	public void disp() {
		System.out.println(x+","+y);
		System.out.println(getX()+","+getY());
	}
}