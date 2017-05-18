package com.gtm.demoTransactionSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gtm.metier.Stock;
import com.gtm.service.IService;
import com.gtm.service.exceptions.NotEnoughArticleException;
import com.gtm.service.exceptions.QteNegativeException;
import com.gtm.service.exceptions.articleNotFoundException;

public class Lanceur {
	public static void main(String[] args) {

		// 1- Chargement du container et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2- récuperation d'un bean
		IService iService= (IService) appContext.getBean("serviceImpl");
//		Stock s1 = (Stock) appContext.getBean("stock");
//		s1.setNom("A1");
//		s1.setQuantite(10);
//		iService.ajouter(s1);
//		Stock s2 = (Stock) appContext.getBean("stock");
//		s2.setNom("A2");
//		s2.setQuantite(20);
//		iService.ajouter(s2);
//		Stock s3 = (Stock) appContext.getBean("stock");
//		s3.setNom("A3");
//		s3.setQuantite(10);
//		iService.ajouter(s3);
//		Stock s4 = (Stock) appContext.getBean("stock");
//		s4.setNom("A4");
//		s4.setQuantite(40);
//		iService.ajouter(s4);
//		Stock s5 = (Stock) appContext.getBean("stock");
//		s5.setNom("A5");
//		s5.setQuantite(50);
//		iService.ajouter(s5);
//		Stock s6 = (Stock) appContext.getBean("stock");
//		s6.setNom("A6");
//		s6.setQuantite(60);
//		iService.ajouter(s6);
//		Stock s7 = (Stock) appContext.getBean("stock");
//		s7.setNom("A7");
//		s7.setQuantite(70);
//		iService.ajouter(s7);
//		Stock s8 = (Stock) appContext.getBean("stock");
//		s8.setNom("A8");
//		s8.setQuantite(80);
//		iService.ajouter(s8);
//		Stock s9 = (Stock) appContext.getBean("stock");
//		s9.setNom("A9");
//		s9.setQuantite(90);
//		iService.ajouter(s9);
//		
		
//		try {
//			iService.sortArticleDuStock(2, 88);
//		} catch (articleNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (QteNegativeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NotEnoughArticleException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	try {
		System.out.println(iService.getQtyEnStock(3));
	} catch (articleNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}

	}


