package days06_basic;

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

public class OopEX {
	public static void main(String[] args) {
		Point pt = new Point();
		//System.out.println(pt.getX() +" "+pt.getY());
		
		//pt.x = 90;	pt.y = 80; //private ������� ����� ���� �Ұ���
		pt.setX(90);	pt.setY(80); // private ������� ����� setter�� ����
		pt.disp();
		//System.out.println(pt.getX() +" "+pt.getY());
	}
}
