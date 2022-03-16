package ex02_stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());
		
		System.out.println("length      /   capacity");
		int len = sb.length();		int size = sb.capacity();
		System.out.println(len + "  /  " + size);
		
		sb.append("adsfa   adsfdas 212312 dad");
		System.out.println(sb.length() + " " + sb.capacity() );
		sb.trimToSize();
		System.out.println(sb.length() + " " + sb.capacity() );
		
		System.out.println(sb.hashCode());
	}
}
