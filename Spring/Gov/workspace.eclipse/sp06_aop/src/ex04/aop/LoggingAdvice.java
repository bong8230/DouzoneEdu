package ex04.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//XML기반 POJO 방식의 AspectJ를 이용한 AOP 방법
public class LoggingAdvice {
	
	/*
	 * Around 방식의 사전//사후처리 AOP around 방식으로 할때는
	 * 인수는 ProceedingJoinPoint, 리턴 - Object 필수
	 */
	
	public Object around(ProceedingJoinPoint point) throws Throwable{
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[LOG] methodName = " + methodName +
				", methodName2 = " + methodName2 + " 호출 되기 전....");
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		Object object = point.proceed();
		
		System.out.println("[LOG] " + methodName + "호출 완료되었습니다.");
		System.out.println("[LOG] running time : " + sw.getTotalTimeMillis()/1000+"초");
		
		return object;
	}
}
