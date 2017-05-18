package com.gtm.demoinjection.intercepteurs;

import org.aspectj.lang.ProceedingJoinPoint;

public class Musiciens {
	public Musiciens(){
		}
//	Méthode d'apsect sans appeler la methode cible
//	public void jeJoue(){
//		System.out.println("Je joue");
//	}
	
	
//	Méthode d'apsect en appellant la methode cible
	public Object jeJoue(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Je joue");
		return pjp.proceed();
		
		
	}
	
	}
