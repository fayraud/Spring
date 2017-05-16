package com.gtm.DemoSpring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gtm.DemoSpring1.SocieteDevLogiciel;

public class TestInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- Chargement du container et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2- récuperation d'un bean
		SocieteDevLogiciel societe = (SocieteDevLogiciel) appContext.getBean("societe");
		//3- traitement
		System.out.println(societe);
		//4- detruire le context
		appContext.close();
	}

}
