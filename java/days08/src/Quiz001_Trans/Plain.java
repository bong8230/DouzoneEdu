package Quiz001_Trans;

public class Plain extends Trans {
	String SPlain, TPlain;
	@Override
	public String start() {
		SPlain = "�������������פ������������������̤��̤Ӥ�Ǫ�ƾƾƾƾƾ�";
		return SPlain;
	}

	@Override
	public String stop() {
		TPlain = "�����̤ӤӤӤӤӤӤӳ����̤������������̤�Ǫ���ԱԱԱԤ���";
		return TPlain;
	}

	@Override
	public void show(String name) {
		start();
		stop();
		System.out.println(name + "�� ��� : " + SPlain +", ����  : " + TPlain);
	}

}
