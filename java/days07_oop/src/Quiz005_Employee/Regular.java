package Quiz005_Employee;
//급여
public class Regular extends Employee {
	protected int sal;

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public String toString() {
		super.toString();
		return "급여 :" + sal + "\n";
	}
}
