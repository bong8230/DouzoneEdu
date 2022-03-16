package ex01_thread;

public class MainEntry {
		public static void main(String[] args) {
//			Thread t1 = new Thread();
			Thread t1 = new UserThread("t1");
			Thread t2 = new UserThread("t2");
			Thread t3 = new UserThread("t3");
			
//			t1.run();  // ëª…ì‹œ? ?¸ ?˜¸ì¶œì? ?Š¤? ˆ?“œ ?‘?—… ?•ˆ?‹˜
			
			t2.setPriority(10);
			t1.setPriority(2);
			t3.setPriority(5);
			
			t1.start();   // run() ?œ ?„?•œ?‹¤.
			t2.start(); 
			t3.start(); 
			System.out.println("=====================");
			System.out.println(t3.getPriority());
			
			System.out.println("&&&&&&&&&&&&&&&&&&");
			System.out.println(t2.getName());
			System.out.println(t1.getName());
			System.out.println(t3.getName());
			
			System.out.println("**************************");
			System.out.println(t2.getId());
			System.out.println(t1.getId());
			System.out.println(t3.getId());
			System.out.println();
			
		}
}





