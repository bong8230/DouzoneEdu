package q01.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {
	public Object around(ProceedingJoinPoint point) throws Throwable{
		
		
		Object object = point.proceed();
		
		return object;
	
	}
}
