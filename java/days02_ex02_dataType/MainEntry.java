package days02_ex02_dataType;

public class MainEntry {
	public static void main(String[] args) {
	boolean b = true;
	int x = 30;
	
	System.out.println(x);
	System.out.println(b);
	
	float ff = 12.34f;
	System.out.println(ff);
	
	System.out.println(5.5F);
	
	short sh=32767; //-32768 ~ 32767
	int i = 32769; // -21¾ï~~21¾ï
	
	System.out.println(sh + ":" + i);
	
	i = -32769;
	sh = (short)i;
	System.out.println(i);
	System.out.println(sh);
	//	sh =(short) i;
//	System.out.println(sh);
//	
//	char sc = 'a';
//	System.out.println(sc);
	
	
}
}
