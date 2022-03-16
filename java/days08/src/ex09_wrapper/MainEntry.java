package ex09_wrapper;

class Point{}

public class MainEntry {
	public static void main(String[] args) {
		
		Integer Ia = new Integer(10);
		Integer Ib = new Integer("10");
		
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(pt.getClass().getName() + '@' + Integer.toHexString(pt.hashCode()));
		System.out.println();
		System.out.println(Ia);
		System.out.println(Ia.getClass().getName() + '@' + Integer.toHexString(Ia.hashCode()));
		
		
		int x = 77;
		double y = 5.5;
		System.out.println(x+" "+y);
		
		
		x=(int)y;
		System.out.println(x+" "+y);
		
		
		//Boxing vs UnBoxing
		int c= Ia.intValue();//
		int d= Ib;
		
		System.out.println(c + " " + d );
		
	}
}
