package ex03.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("invoke start");
		
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 start");
		
		Object result = invocation.proceed();
		
		log.info("타이머 정지");
		sw.stop();

		log.info("[TimerLOG] Method : " + invocation.getMethod());
		log.info("[TimerLOG] process Time : " + sw.getTotalTimeMillis());

		
		return result;
	}

}
