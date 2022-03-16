package Quiz005_Employee;

public class Employee  {
	protected String name, pos, dpart, Phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getDpart() {
		return dpart;
	}

	public void setDpart(String dpart) {
		
		this.dpart = dpart;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}
	
	public String toString() {
		return "이름 : " + name + "\n" + 
				"직급 : " + pos + "\n" + 
				"부서 : " + dpart + "\n" +
				"연락처 : " + Phone + "\n";
				
	}
	
}
