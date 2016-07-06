/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
/**
 * Interface for accessing persistence entity Peconnectiontype
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 *
 */
import com.peycash.persistence.domain.Peconnectiontype;

/**
 * Interface to access persistence entity Peconnectiontype
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 *
 */
public interface PeConnectionTypeDAO extends BaseDAO<Peconnectiontype, Long> {

	/**
	 * Find the specific type of connection. This method is used only for
	 * testing
	 * 
	 * @param id
	 * @throws PersistenceException
	 */
	public void find(long id);

}
