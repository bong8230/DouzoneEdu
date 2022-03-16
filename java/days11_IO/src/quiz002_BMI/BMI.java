package quiz002_BMI;

class BMI {
	protected String name,gender,bmiresult;
	protected double height,weight;
	protected double bmi;
	
	public BMI() {}
	
	public BMI(String name,double weight, double height, String gender,double bmi,String bmiresult) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.bmi = bmi; 
		this.bmiresult = bmiresult;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getBmiresult() {
		return bmiresult;
	}

	public void setBmiresult(String bmiresult) {
		this.bmiresult = bmiresult;
	}
	
}