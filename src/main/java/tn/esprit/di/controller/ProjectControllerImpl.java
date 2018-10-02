/*
 * Copyright 2017 by Walid YAICH <walid.yaich@esprit.tn>
 * This is an Open Source Software
 * License: http://www.gnu.org/licenses/gpl.html GPL version 3
 */

package tn.esprit.di.controller;

import tn.esprit.di.service.IClientInfoService;

/**
 * 
 * Cette classe sert a implémenter les méthodes qui permettent de gérer un projet.
 * Cette classe représente une implémentation de l'interface <code>IidentityController</code>
 * 
 * @author Walid YAICH
 *
 */
public class ProjectControllerImpl implements IprojectController  {
	
	private IClientInfoService clientInfoService;
	
	
	/**
	 * Récupérer le titre et les détails du projet en ayant l'id du client
	 * @param clientId l'identifiant du client
	 * @return le titre et les détails du projet
	 */
	@Override
	public String getProjectByClientId(int clientId){
		return "Le projet de ce client est " + clientInfoService.getProjectTitleByClientId(clientId) + 
				"\n" + clientInfoService.getProjectDetailsByClientId(clientId); 
	}


	public IClientInfoService getClientInfoService() {
		return clientInfoService;
	}


	public void setClientInfoService(IClientInfoService clientInfoService) {
		this.clientInfoService = clientInfoService;
	}

}
