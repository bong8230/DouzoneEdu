package edu.kosa.model;

public class GiftVO {
	
	// DB 연결
	private int gno, gStart, gEnd ; 
	private String gname;
	
	public GiftVO() { }

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public int getgStart() {
		return gStart;
	}

	public void setgStart(int gStart) {
		this.gStart = gStart;
	}

	public int getgEnd() {
		return gEnd;
	}

	public void setgEnd(int gEnd) {
		this.gEnd = gEnd;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}
	
	
	// DML - SELECT
}
