/*
 * Copyright 2017 by Walid YAICH <walid.yaich@esprit.tn>
 * This is an Open Source Software
 * License: http://www.gnu.org/licenses/gpl.html GPL version 3
 */

package tn.esprit.di.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import tn.esprit.di.service.IClientInfoService;
/**
 * 
 * Cette classe représente une implémentation de l'interface <code>IidentityController</code> .
 * Cette classe implémente les méthodes qui permettent de gérer l'identité d'un client.
 * 
 * @author Walid YAICH
 *
 */
@Component("identityControllerBean")
public class IdentityControllerImpl implements IidentityController {
		@Autowired
		@Qualifier("clientInfoSOAPServiceImpl")
	private IClientInfoService clientInfoService;
	
	//TODO Déclarer le logger
	
	
	/**
	 * Récupérer le nom et prénom d'un client en ayant son Id
	 * @param clientId  l'identifiant du client
	 * @return prénom et nom du client
	 */
	@Override
	public String getFullNameByClientId(int clientId){
		//Appeler le webservice SOAP
		return "Nom et prenom : " +  
				clientInfoService.getFirstNameByClientId(clientId) + " " +
				clientInfoService.getLastNameByClientId(clientId);
	}


	public IClientInfoService getClientInfoService() {
		return clientInfoService;
	}


	public void setClientInfoService(IClientInfoService clientInfoService) {
		//TODO  Ecrire un message pour vérifier l'exécution de cette méthode (en utilisant le logger avec le bon niveau de logging).
		this.clientInfoService = clientInfoService;
	}
	
}
