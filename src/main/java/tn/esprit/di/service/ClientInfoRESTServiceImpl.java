/*
 * Copyright 2017 by Walid YAICH <walid.yaich@esprit.tn>
 * This is an Open Source Software
 * License: http://www.gnu.org/licenses/gpl.html GPL version 3
 */

package tn.esprit.di.service;


/**
 * 
 * Cette classe permet de gérer les informations client via un web service REST.
 * 
 * NB : Pour des raisons de simplicité, cette classe ne fait pas un vrai appel a un web service REST, 
 * mais retourne des valeurs statiques.
 * 
 * @author Walid YAICH
 *
 */
public class ClientInfoRESTServiceImpl implements IClientInfoService{
	
	/**
	 * Récupérer le titre du projet en ayant l'id du client
	 * @param clientId l'identifiant du client
	 * @return le titre du projet 
	 */
	@Override
	public String getProjectTitleByClientId(int clientId){
		//Appel a un webservice REST
		return "Gestion des produits <From REST>" ;
	}
	
	
	/**
	 * Récupérer le prénom du client en ayant son Id
	 * @param clientId l'identifiant du client
	 * @return le prénom du client
	 */
	@Override
	public String getFirstNameByClientId(int clientId){
		//Appel a un webservice REST
		return "Walid <From REST>";
	}
	
	
	/**
	 * Récupérer le nom du client en ayant son Id
	 * @param clientId l'identifiant du client
	 * @return String le nom du client
	 */
	@Override
	public String getLastNameByClientId(int clientId){
		//Appel a un webservice REST
		return "YAICH <From REST>";
	}

	
	/**
	 * Récupérer les détails du projet d'un client en ayant son Id
	 * @param clientId l'identifiant du client
	 * @return les détails du projet
	 */
	@Override
	public String getProjectDetailsByClientId(int clientId) {
		//Appel a un webservice REST
		return "Les details du projet gestion de produits <From REST>";
	}
	
}
