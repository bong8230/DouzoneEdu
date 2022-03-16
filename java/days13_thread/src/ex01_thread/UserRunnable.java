package ex01_thread;

public class UserRunnable implements Runnable {
	
	String name;
	
	public UserRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {  // ?Š¤? ˆ?“œ ?‹¤?–‰ë¶?
//		System.out.println("Runnable interface run() call ");
		System.out.println(name);
		
		for (int i = 1; i <= 10; i++) {
			
			if( i == 7 ) {
				try {
					Thread.sleep(500);    // 0.5ì´? ?™?•ˆ,   1000/1 ==> 1ì´?
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}  // end for
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
//		Runnable u1 = new UserRunnable("u1");
//		Thread t1 = new Thread(u1);
//		Thread t2 = new Thread(new UserRunnable("u2"));
//		Thread t3 = new Thread(new UserRunnable("u3"));
		
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
		
		System.out.println("-----------------------------");
		System.out.println(
				new Thread(new UserRunnable("u1")).getId());
		System.out.println(
				new Thread(new UserRunnable("u1")).getName());
		System.out.println("-----------------------------");
		
		
//		t1.start();
//		t2.start();
//		t3.start();
	}
}









