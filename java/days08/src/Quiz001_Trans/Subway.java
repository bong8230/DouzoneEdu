package Quiz001_Trans;

public class Subway extends Trans {
	String Ssubway, Tsubway;
	@Override
	public String start() {
		Ssubway = "열차가 출발합니다.";
		return Ssubway;
	}

	@Override
	public String stop() {
		Tsubway = "출입문이 열립니다.";
		return Tsubway;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "의 출발 : " + Ssubway +", 도착  : " + Tsubway);
	}

}
