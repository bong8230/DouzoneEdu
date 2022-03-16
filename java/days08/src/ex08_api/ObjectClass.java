package ex08_api;

import java.awt.Point;

class point{}

public class ObjectClass {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println(pt.getClass());
		System.out.println(pt.hashCode());
		System.out.println(pt.toString());
		
		
		Point pt2 = new Point();
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());
		System.out.println("Object String" + pt2.toString());
		System.out.println("Object String" + pt2);
		
		
		System.out.println("pt2.toString() : toStirng()의 의미");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()) );
		
		Point pt3 = new Point();

		if(pt.hashCode() == pt3.hashCode())
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		Point pt4;
		pt4 = pt;
		
		if(pt.hashCode() == pt4.hashCode())
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}
