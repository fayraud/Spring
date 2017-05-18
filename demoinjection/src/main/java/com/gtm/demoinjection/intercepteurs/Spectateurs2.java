package com.gtm.demoinjection.intercepteurs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Spectateurs2 {
	public Spectateurs2(){
		
	}
	
	@Pointcut("execution(* *.performe(..))")
	public void performance(){
		
	}
	
	@Before("performance()")
	public void prendPlace(){
		System.out.println("Les spectateurs2 prennent place");
	}
	
	

}
