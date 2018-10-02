/*
 * Copyright 2017 by Walid YAICH <walid.yaich@esprit.tn>
 * This is an Open Source Software
 * License: http://www.gnu.org/licenses/gpl.html GPL version 3
 */

package tn.esprit.di.service;


/**
 * Cette interface permet de lister les méthodes qui permettent de gérer les informations d'un client.
 * @author Walid YAICH
 *
 */
public interface IClientInfoService {
	public String getProjectTitleByClientId(int clientId);
	public String getProjectDetailsByClientId(int clientId);
	public String getFirstNameByClientId(int clientId);
	public String getLastNameByClientId(int clientId);
}