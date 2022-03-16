package days06_basic;

class Point{ //public은 main 메소드가 있는곳에만 선언이 가능함
	private int x,y; // 멤버변수
	
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
		
		//pt.x = 90;	pt.y = 80; //private 멤버변수 선언시 접근 불가능
		pt.setX(90);	pt.setY(80); // private 멤버변수 선언시 setter로 접근
		pt.disp();
		//System.out.println(pt.getX() +" "+pt.getY());
	}
}
