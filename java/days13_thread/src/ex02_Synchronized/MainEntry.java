package ex02_Synchronized;

class Atm {
	private int moneny;

	public Atm(int money) {
		this.moneny = money;
	}

	// ?κΈν¨?
	public synchronized void deposit(int amount, String name) {
		moneny += amount;
		System.out.println(name + " : ?κΈκΈ?‘ " +amount);
	}

	// μΆκΈ?¨?
	public void withdraw(int amount, String name) {
		synchronized (this) {
			if( (moneny - amount) > 0 ) {
				Thread.yield();   // 
				moneny -= amount;
				System.out.println(name + " : μΆκΈκΈμ‘ " +amount);
			} else {
				System.out.println(name + " : μΆκΈλͺ»ν¨(??‘ λΆ?μ‘?~~~~)" );
			}
		}
	}
	
	public void getMoney() {
		System.out.println("      ??‘?? : " + moneny);
	}
} // Atm class end

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;

	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(flag) {
				obj.deposit((int)(Math.random() * 10 + 2) * 100, getName());
				obj.getMoney();
			} else {
				obj.withdraw((int)(Math.random() * 10 + 2) * 100, getName());
				obj.getMoney();
			}
			flag = true;
			
		} // for end
	}  // run() end
} // UserAtm class end



public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "λ°μ ?¬");
		UserAtm user2 = new UserAtm(at, "? ??");
		UserAtm user3 = new UserAtm(at, "?Έ??°");
		
		user1.start();
		user2.start();
		user3.start();
	}
}





