package ex03_innerClass;
 
class OuterClass {  // ?���??��?��?��
	static int no;
	String memssage = "hi~~~";
	
	public void outerMehtod() {
		System.out.println("outer method call~~~");
//		System.out.println(su);  // inner class 멤버 ?���? 불�??��
	}
	
	class InnerClass { // ?���??��?��?��
		int su = 99;
		public void show() {
			System.out.println(su);  // ?���?(?��?��?���?) ?��?���??��
			System.out.println(memssage); // ?���??��?��?�� 멤버 ?��?�� �??��
		}
		public void disp() {
			outerMehtod();  // ?���??��?��?�� 메소?�� ?���?
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








