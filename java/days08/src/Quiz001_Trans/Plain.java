package Quiz001_Trans;

public class Plain extends Trans {
	String SPlain, TPlain;
	@Override
	public String start() {
		SPlain = "戚戚戚戚戚戚跡ししし戚戚戚戚戚戚戚び戚びし祢焼焼焼焼焼焼";
		return SPlain;
	}

	@Override
	public String stop() {
		TPlain = "戚戚戚びびびびびびび晦戚戚び戚戚戚戚跡戚び祢輯鋭鋭鋭鋭ば整";
		return TPlain;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "税 窒降 : " + SPlain +", 亀鐸  : " + TPlain);
	}

}
