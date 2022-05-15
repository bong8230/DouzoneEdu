package ex02.aop;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements InvocationHandler {

	private Object target;
	
	
	public LogPrintHandlerImpl(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] arg) throws Throwable {
		
		Log log = LogFactory.getLog(this.getClass());

		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 start");

		int result = (int)method.invoke(target,arg);//중심코드
		
		log.info("타이머 정지");
		sw.stop();

		log.info("[TimerLOG] Method : " + method.getName());
		log.info("[TimerLOG] process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}

}
