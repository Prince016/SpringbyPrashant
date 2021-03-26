package exerciseQ1;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* getName())")
	public void beforeadvice() {
		System.out.println(" ------ Calling the Before advice method ------");
		
	}
	
	
	
	
	
	@After("execution(* setName(..))")
	public void addAdvice() {
		System.out.println( "\n ------  After  addAdvice method ---  !!! ------  \n ");
	}
	
	
	
	
	@Around("logpoint()")
	public Object addAdviceSalary(ProceedingJoinPoint jointPoint) {
		Object retunValue=null;
		
		try {
			retunValue=jointPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("throwing ");
		}
		System.out.println( "\n ------  Around  addAdvice to calSalary  method ---  !!! ------  \n "+jointPoint.getSignature());
		return retunValue;
	}
	 
	@Pointcut("execution(* calSalary())")
	public void logpoint() {
		
	}
	
	
}











