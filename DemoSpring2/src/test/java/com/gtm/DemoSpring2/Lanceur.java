package com.gtm.DemoSpring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gtm.metier.User;
import com.gtm.service.IService;

public class Lanceur {

	public static void main(String[] args) {

		// 1- Chargement du container et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2- récuperation d'un bean
		IService iService= (IService) appContext.getBean("serviceImpl");
		User u = (User) appContext.getBean("user");
		// 3- traitement
		iService.ajouterUser(u);
		// 4- detruire le context
		appContext.close();

	}

}
