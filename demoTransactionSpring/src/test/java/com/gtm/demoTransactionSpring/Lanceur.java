package com.gtm.demoTransactionSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gtm.metier.Stock;
import com.gtm.service.IService;

public class Lanceur {
	public static void main(String[] args) {

		// 1- Chargement du container et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2- récuperation d'un bean
		IService iService= (IService) appContext.getBean("serviceImpl");
		Stock s = appContext.getBean(requiredType)
		
	}

}
