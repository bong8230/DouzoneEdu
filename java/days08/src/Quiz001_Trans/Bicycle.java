package Quiz001_Trans;

public class Bicycle extends Trans {
	String SBcle, TBcle;
	@Override
	public String start() {
		SBcle = "������������";
		return SBcle;
	}

	@Override
	public String stop() {
		TBcle = "����������������";
		return TBcle;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "�� ��� : " + SBcle +", ����  : " + TBcle);
	}
}
