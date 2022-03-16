package ex03_innerClass;
 
class OuterClass {  // ?™¸ë¶??´?˜?Š¤
	static int no;
	String memssage = "hi~~~";
	
	public void outerMehtod() {
		System.out.println("outer method call~~~");
//		System.out.println(su);  // inner class ë©¤ë²„ ? ‘ê·? ë¶ˆê??Š¥
	}
	
	class InnerClass { // ?‚´ë¶??´?˜?Š¤
		int su = 99;
		public void show() {
			System.out.println(su);  // ?‚´ë¶?(??‹ ?˜ê²?) ?‚¬?š©ê°??Š¥
			System.out.println(memssage); // ?™¸ë¶??´?˜?Š¤ ë©¤ë²„ ?‚¬?š© ê°??Š¥
		}
		public void disp() {
			outerMehtod();  // ?™¸ë¶??´?˜?Š¤ ë©”ì†Œ?“œ ?˜¸ì¶?
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








