package ex03_innerClass;
 
class OuterClass {  // ?ΈλΆ??΄??€
	static int no;
	String memssage = "hi~~~";
	
	public void outerMehtod() {
		System.out.println("outer method call~~~");
//		System.out.println(su);  // inner class λ©€λ² ? κ·? λΆκ??₯
	}
	
	class InnerClass { // ?΄λΆ??΄??€
		int su = 99;
		public void show() {
			System.out.println(su);  // ?΄λΆ?(?? ?κ²?) ?¬?©κ°??₯
			System.out.println(memssage); // ?ΈλΆ??΄??€ λ©€λ² ?¬?© κ°??₯
		}
		public void disp() {
			outerMehtod();  // ?ΈλΆ??΄??€ λ©μ? ?ΈμΆ?
		}
	} // InnerClass end
	
} // OuterClass end

public class MainEntry {
	public static void main(String[] args) {
		//1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();		inner.show();
		System.out.println("=========================");
		
		//2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
	}
}








