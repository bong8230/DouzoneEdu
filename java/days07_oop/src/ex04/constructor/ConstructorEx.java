package ex04.constructor;

/**
 * @author º∫∫¿¡¶
 *
 */
public class ConstructorEx {
	public static void main(String[] args) {
		int x,y,gob=1;
		String msg;
		char ch = 'A';
		
		x=5; y=10;
		msg = "zzzzzzz";
		gob = gob(x,y);
		
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x+"*"+y+"="+gob);
	}
	
	public static int gob(int x, int y) {
		return x*y;
	}
}
