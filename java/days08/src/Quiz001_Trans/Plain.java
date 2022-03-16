package Quiz001_Trans;

public class Plain extends Trans {
	String SPlain, TPlain;
	@Override
	public String start() {
		SPlain = "이이이이이이잉ㅇㅇㅇ이이이이이이이ㅣ이ㅣㅇ푸아아아아아아";
		return SPlain;
	}

	@Override
	public String stop() {
		TPlain = "이이이ㅣㅣㅣㅣㅣㅣㅣ끼이이ㅣ이이이이잉이ㅣ푸슈규규규규ㅠ육";
		return TPlain;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "의 출발 : " + SPlain +", 도착  : " + TPlain);
	}

}
