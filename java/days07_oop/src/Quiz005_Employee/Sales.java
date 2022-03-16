package Quiz005_Employee;

public class Sales extends Regular {
	protected String dpart;
	
	public String getDpart() {
		dpart = "Sales";
		return dpart;
	}

	public void setDpart(String dpart) {
		this.dpart = dpart;
	}
	
	
	
	@Override
	public String toString() {
		super.toString();
		return "ºÎ¼­´Â : " + dpart + "\n";
	}
	
	
}
