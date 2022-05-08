package ex04.di.resource;

import javax.annotation.Resource;

public class MonitorViewer {
	private Recorder recorder; // 멤버 필드

	@Resource(name = "record3")
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;

		if (Resource.class.getTypeName().equals("record1")) {
			System.out.println("@Resource 주입-1");
		} else if (Resource.class.getTypeName().equals("record2")) {
			System.out.println("@Resource 주입-2");
		} else if (Resource.class.getTypeName().equals("record3")) {
			System.out.println("@Resource 주입-3");
		} else {
			System.out.println("@Resource 주입 없음");
		}
	}
}
