/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Peconfig;

/**
 * Interface to access persistence entity Peconfig
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 *
 */
public interface PeConfigDAO extends BaseDAO<Peconfig, Long> {

	/**
	 * Find the specific configuration for iso8583 environment Requires the ID
	 * to be set in properties file
	 * 
	 * @return
	 * @throws PersistenceException
	 */
	public Peconfig findISOConfig() throws PersistenceException;

}
