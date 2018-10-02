/*
 * Copyright 2017 by Walid YAICH <walid.yaich@esprit.tn>
 * This is an Open Source Software
 * License: http://www.gnu.org/licenses/gpl.html GPL version 3
 */

package tn.esprit.di.service;

import org.springframework.stereotype.Component;

/**
 * 
 * Cette classe permet de gérer les informations client via un web service SOAP.
 * 
 * NB : Pour des raisons de simplicité, cette classe ne fait pas un vrai appel a un web service SOAP, 
 * mais retourne des valeurs statiques.
 * 
 * @author Walid YAICH
 *
 */
@Component
public class ClientInfoSOAPServiceImpl implements IClientInfoService{
	
	
	/**
	 * Récupérer le titre du projet en ayant l'id du client
	 * @param clientId l'identifiant du client
	 * @return le titre du projet 
	 */
	@Override
	public String getProjectTitleByClientId(int clientId){
		//Appel a un webservice SOAP
		return "Gestion des produits <From SOAP>" ;
	}
	
	
	/**
	 * Récupérer le prénom du client en ayant son Id
	 * @param clientId l'identifiant du client
	 * @return le prénom du client
	 */
	@Override
	public String getFirstNameByClientId(int clientId){
		//Appel a un webservice SOAP
		return "Walid <From SOAP>";
	}
	
	
	/**
	 * Récupérer le nom du client en ayant son Id
	 * @param clientId l'identifiant du client
	 * @return String le nom du client
	 */
	@Override
	public String getLastNameByClientId(int clientId){
		//Appel a un webservice SOAP
		return "YAICH <From SOAP>";
	}

	
	/**
	 * Récupérer les détails du projet d'un client en ayant son Id
	 * @param clientId l'identifiant du client
	 * @return les détails du projet
	 */
	@Override
	public String getProjectDetailsByClientId(int clientId) {
		//Appel a un webservice SOAP
		return "Les details du projet gestion de produits <From SOAP>";
	}

}
