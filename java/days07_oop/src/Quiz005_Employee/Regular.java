package Quiz005_Employee;
//�޿�
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
		return "�޿� :" + sal + "\n";
	}
}
