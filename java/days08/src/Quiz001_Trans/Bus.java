package Quiz001_Trans;

public class Bus extends Trans {
	String SBus, TBus;
	
	@Override
	public String start() {
		SBus = "�θ��������������Ѹ�����������ƾƾƤ��Ӥ�";
		return SBus;
	}

	@Override
	public String stop() {
		TBus = "������������~ ����������~ Ǫ������~";
		return TBus;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "�� ��� : " + SBus +", ����  : " + TBus);
	}
}
