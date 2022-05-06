package ex03.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	public Recorder recorder;
	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("@Autowired 자동 주입");
	}
}
