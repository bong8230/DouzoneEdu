package ex01_string;

public class MainEntry {
	public static void main(String[] args) {
		
//		String str = new String("korea");
//		int x = 99;
//		double y =12.34;
//		String message = "hi";
//		
//		System.out.println(str);
//		System.out.println(message);
//		System.out.println(x+" "+y);
//		
//		char data[] = {'a','b','c'};
//		String str2 = new String(data);
		
		
		String s1 = "happydoyeon";
		String s2 = "SEOUL";
		
		System.out.println(s2.hashCode());
		System.out.println(s2.replace("EO", "korea") );
		System.out.println(s2);
		System.out.println(s2.hashCode());
		s2=s2.replace("EO", "korea");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println();
		s1= s1+s2;
		System.out.println(s1);
		
		System.out.println("============================");
		String s3 = new String("	ab	cd	");
		System.out.println(s3);
		System.out.println(s3.length()); //문자열 길이
		s3 = s3.trim();
		System.out.println(s3);
		System.out.println(s3.length());
		System.out.println("============================");
		
//		String s4 = new String("ab defgh 23444 keirw 99349");
//		String[] s5 = s4.split(" ");
//		for (int i = 0; i < s5.length; i++) {
//			System.out.println("분리된 "+ i +"번 문자열" + s5[i]);
//		}
		
		String s4 = new String("ab/defgh/23444/keirw/99349");
		String[] s5 = s4.split("/");
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 "+ i +"번 문자열" + s5[i]);
		}
		System.out.println("============================");
		String s6 = "123455567kfjhk 4853485 reassdd 93493 string";
		int n = s6.indexOf('5');
		System.out.println(n);
		System.out.println(s6.indexOf('r'));
		System.out.println(s6.lastIndexOf('5'));
		System.out.println("============================");
		
		char ch = s6.charAt(24);
		System.out.println(ch);
		System.out.println(s6.charAt(21));
		
		s6 = s6.substring(3); // 3번 인덱스부터 끝까지 출력
		System.out.println(s6);
		
		s6 = s6.substring(5,7); //시작값 포함, 끝값 미포함
		System.out.println(s6);
	}
}
