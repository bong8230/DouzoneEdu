package Quiz002;

class Score {
	protected String name;
	protected int kor,eng,pc,total;
	protected double average;
	
	public Score() {}
	
	public Score(String name, int kor, int eng, int pc) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.pc = pc;
		this.total = kor+eng+pc;
		this.average = total/3.0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
}