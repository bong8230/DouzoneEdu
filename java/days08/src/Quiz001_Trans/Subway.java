package Quiz001_Trans;

public class Subway extends Trans {
	String Ssubway, Tsubway;
	@Override
	public String start() {
		Ssubway = "������ ����մϴ�.";
		return Ssubway;
	}

	@Override
	public String stop() {
		Tsubway = "���Թ��� �����ϴ�.";
		return Tsubway;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "�� ��� : " + Ssubway +", ����  : " + Tsubway);
	}

}
