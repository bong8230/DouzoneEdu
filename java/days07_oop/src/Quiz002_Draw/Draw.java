package Quiz002_Draw;

public class Draw { //super class
	protected int w,h;
	protected double result;
	
	public Draw() {w=h=0; result=0;}
	
	public Draw(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public String toString() {
		return "Draw result : "+result;
	}
	public double calc(){
//		result = w*h;
		return result;
	}
	public void show() {
		System.out.println();
	}
}
