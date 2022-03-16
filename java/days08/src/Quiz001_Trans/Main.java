package Quiz001_Trans;


public class Main {
	public static void main(String[] args) {
		Trans[] tt = new Trans[4];
		Object[] trans = { new Subway(), new Bus(), new Plain(), new Bicycle() };
		String[] name = { "지하철", "버스", "비행기","자전거" };
		for (int i = 0; i < tt.length; i++) {
			tt[i] = (Trans) trans[i];
			tt[i].show(name[i]);
		}
	}
}
