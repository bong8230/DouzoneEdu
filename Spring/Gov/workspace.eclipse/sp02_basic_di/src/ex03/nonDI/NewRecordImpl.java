package ex03.nonDI;

public class NewRecordImpl implements IRecord {
	private int kor, eng, com;

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

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	public int total() {
		return this.kor + this.eng + this.com;
	}
	
	public float avg() {
		return total()/4.0f;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
