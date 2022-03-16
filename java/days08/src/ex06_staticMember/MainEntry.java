package ex06_staticMember;

class Atm{
	int count; // instance member
	static int total; // static member
	
	public Atm(int amount) {
		count += amount;
		total += amount;
	}
	
	public void display() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
	
	//static member���� �Ϲݸ�������� ����� ������.
//	public static void View() {
//		total = total + 100;
//		//count = count + 100;
//	}
	
	//static member���� this ��� �Ұ�
//	public static void show() {
//		this.count = count;
//		this.total = total;
//	}
}

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display();
		System.out.println("================================");
		
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("================================");
		
		Atm at3 = new Atm(1000);
		at3.display();
	}
}
