package com.gtm.demoinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1- Chargement du container et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("Spectacle.xml");
		// 2- récuperation d'un bean
		Performeur Oliv = (Performeur) appContext.getBean("Olivier");
		Performeur caro = (Performeur) appContext.getBean("Caroline");
//		Performeur jm = (Performeur) appContext.getBean("jean_marc");
		MusicienPolyInstruments jul = (MusicienPolyInstruments) appContext.getBean("julien");
		MusicienPolyInstruments alain = (MusicienPolyInstruments) appContext.getBean("alain");
		Performeur louis = (Performeur) appContext.getBean("Louis");
		Performeur michel = (Performeur) appContext.getBean("michel");
		Performeur maurice = (Performeur) appContext.getBean("maurice");
		Performeur martin = (Performeur) appContext.getBean("martin");
		Performeur monMusicien = (Performeur) appContext.getBean("monMusicien");
		

		// 3- traitement
		System.out.println("-----------Olivier-----------");
		Oliv.performe();
//		System.out.println(Oliv);
		System.out.println();
		System.out.println("----------Caroline------------");
		caro.performe();
//		System.out.println(caro);
		System.out.println();
//		System.out.println("----------Jean marc------------");
//		jm.performe();
//		System.out.println(jm);
		System.out.println();
		System.out.println("----------Julien------------");
		jul.performe();
//		System.out.println(jul);
		System.out.println();
		System.out.println("----------Alain------------");
		alain.performe();
		System.out.println();
		System.out.println("----------louis------------");
		louis.performe();
		System.out.println();
//		System.out.println(alain);
		System.out.println("----------Michel------------");
		michel.performe();
		System.out.println();
		System.out.println("----------Maurice------------");
		maurice.performe();
		System.out.println();
		System.out.println("----------Martin------------");
		martin.performe();
		System.out.println();
		System.out.println("----------monMusicien------------");
		monMusicien.performe();
		System.out.println();
		
		// 4- detruire le context
		appContext.close();
	}

}
