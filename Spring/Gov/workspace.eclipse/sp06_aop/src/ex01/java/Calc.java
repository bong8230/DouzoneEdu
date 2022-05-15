package ex01.java;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {
	public int add(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());

		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 start");

		int result = x + y;//중심코드
		
		log.info("타이머 정지");
		sw.stop();

		log.info("[TimerLOG] Method : add");
		log.info("[TimerLOG] process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}
}
