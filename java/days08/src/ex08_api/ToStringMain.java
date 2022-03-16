package ex08_api;

class Rectangle{
	int x,y;
	public void dis() {
		System.out.println(x+","+y);
	}
	
	public String toString() {
		return "Rectangle [x=" + x + ",y=" +y +"]";
	}
}

public class ToStringMain {
	public static void main(String[] args) {
		
		public String toString() {
			return "ToStringMain " + super.toString();
		}
		
		Rectangle r= new Rectangle();
		r.dis();
		System.out.println(r);
		System.out.println(r.toString());
	}
}
