/*
 * Copyright 2017 by Walid YAICH <walid.yaich@esprit.tn>
 * This is an Open Source Software
 * License: http://www.gnu.org/licenses/gpl.html GPL version 3
 */

package tn.esprit.di.presentation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.esprit.di.config.AnnotationConfig;
import tn.esprit.di.controller.IidentityController;

/**
 * C'est la classe main, elle intéragit avec la couche controller
 * Cette classe fait appel au Spring container a travers l'ApplicationContext pour récupérer les beans controller.
 * 
 * @author Walid YAICH
 *
 */
public class ClientView {
	//TODO Déclaration du logger
	
	public static void main(String[] args) {
		int clientId = 7754654;
		Logger logger=LoggerFactory.getLogger(ClientView.class);
		//TODO Charger la configuration
	//	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/config/application-config.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		//TODO Instantiation du bean par le container
		IidentityController identityController = (IidentityController)applicationContext.getBean("identityControllerBean");
		
		//Utilisation du bean servi par le container
		String clientFullName = identityController.getFullNameByClientId(clientId);
		
		//TODO Affichage du nom et prénom du client
		
		logger.info(clientFullName);
		//Fermer l'ApplicationContext
		 ((ConfigurableApplicationContext)applicationContext).close();
	}
}
