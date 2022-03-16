package days02_ex02_dataType;

public class MainEntry2 {
	public static void main(String[] args) {
		int su = 10;
		System.out.printf("10진수: %d\n",su);
		System.out.printf("8진수: %o\n",su);
		System.out.printf("16진수: %x %X\n",su,su);
		
		System.out.printf("\n\n%d %x %o %X \n",10,10,10,10);
		
		//0숫자-->8진수 , 0x숫자 --> 16진수
		System.out.printf("%d \n",012);
		System.out.printf("%d \n",0xA);
		
		double f = 12.34;
		System.out.println(f);
		float ff= 12.34f;
		System.out.println(ff);
		
		/*String str = "A";//문자열, 2byte
		char ch ='A'; // 문자, 1byte -> 2byte
		
		char ch2 = 67;
		char ch3 = 'b'; // ASCII 98
		int su = 20;	String name = "happy";	double dd = 1234, ff=3.45;
		
		System.out.println(ch); // A
		System.out.println(str); // A
		System.out.println((int)ch); //ASCII 65
		System.out.println(ch2 + ch3);
		System.out.println("name =" + name);
		System.out.println("실수형 데이터 : " + dd);
		System.out.printf("%f %f \n",dd,ff);
		
		
		for(int i=65;i<=90; i++) {
			System.out.printf((char)i+" ");
		}
		
		System.out.println("\n\n==============================================");
		
		for(int i='a';i<='z'; i++) {
			System.out.printf(i+" ");
		}
		
		System.out.println("\n\nboolean type");
		boolean flag = true;
		System.out.println(flag);*/
	}
}
