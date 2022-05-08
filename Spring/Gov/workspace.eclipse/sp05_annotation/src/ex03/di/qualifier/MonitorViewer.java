package ex03.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
	public Recorder recorder;
	@Autowired
	@Qualifier("cord")
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("@Autowired 자동 주입11");
	}
	
	@Autowired
	public MonitorViewer(@Qualifier("key") Recorder recorder) {
		this.recorder = recorder;
		System.out.println("생성자 @Autowired - @Qualifier 식별자 자동주입");
	}
	
	public void show() {
		System.out.println("MonitorViewer show method~");
	}
}
