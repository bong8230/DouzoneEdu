package Quiz001_Trans;

public class Bicycle extends Trans {
	String SBcle, TBcle;
	@Override
	public String start() {
		SBcle = "µû¸ªµû¸ªµû¸ª";
		return SBcle;
	}

	@Override
	public String stop() {
		TBcle = "³¢¸®¸®¸®¤ÓÀÌÀÌÀÍ";
		return TBcle;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "ÀÇ Ãâ¹ß : " + SBcle +", µµÂø  : " + TBcle);
	}
}
