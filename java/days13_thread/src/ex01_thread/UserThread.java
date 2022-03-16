package ex01_thread;

public class UserThread extends Thread {
	
	String name;

	public UserThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {  // ?Š¤? ˆ?“œ ?‹¤?–‰ë¶?(êµ¬í˜„ë¶?)
		System.out.println(name);
		
		for (int i = 1; i <= 10; i++) {
			
			if( i == 7 ) {
				try {
					sleep(500);    // 0.5ì´? ?™?•ˆ,   1000/1 ==> 1ì´?
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}  // end for
			
			System.out.println(i);
		}
	}
	
	
}
