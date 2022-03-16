package Quiz001_TV;

public class TV {
	protected int ch, vol;
	private String clr;
	
	public TV(){
				
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int i) {
		this.ch = i;
	}

	public String getClr() {
		return clr;
	}

	public void setClr(String clr) {
		this.clr = clr;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int i) {
		this.vol = i;
	}

	@Override
	public String toString() {
		return "TV [getCh()=" + getCh() + ", getClr()=" + getClr() + ", getVol()=" + getVol() + "]";
	}
	
}
