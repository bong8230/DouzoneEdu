package Quiz001_Trans;

public class Bus extends Trans {
	String SBus, TBus;
	
	@Override
	public String start() {
		SBus = "부르르르르르르르ㅡ르르르르콰쾅아아아ㅏ앙ㅇ";
		return SBus;
	}

	@Override
	public String stop() {
		TBus = "끼이이이이이~ 취이이이익~ 푸슈유욱~";
		return TBus;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "의 출발 : " + SBus +", 도착  : " + TBus);
	}
}
