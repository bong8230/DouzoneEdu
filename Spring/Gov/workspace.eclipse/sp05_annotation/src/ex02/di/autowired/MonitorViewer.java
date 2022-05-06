package ex02.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	//의존관계(객체)
	
	//1.member field 설정
	/*@Autowired
	private Recorder recorder;//멤버필드
	
	public Recorder getRecorder() {
		return recorder;
	}*/
	
	
	//2.setter를 통한 자동주입
/*	private Recorder recorder;//멤버필드
	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("@Autowired 자동 주입 - setter method");
	}
	
	public Recorder getRecorder() {
		return recorder;
	}
*/

	//3.일반 메소드를 통한 자동 주입
	private Recorder recorder;
	@Autowired
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("사용자(일반) 메소드 이용한 자동 주입");
	}


	public void print() {
		System.out.println("method 주입 " + this.recorder);
		recorder.show();
	}
	
}
