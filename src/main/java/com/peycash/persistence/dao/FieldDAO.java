/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Fields;

/**
 * Interface to access persistence entity Fields
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 *
 */
public interface FieldDAO extends BaseDAO<Fields, Long> {

	/**
	 * Find the related Fields by the Message MTI
	 * 
	 * @param MTI
	 * @return
	 * @throws PersistenceException
	 */
	public List<Fields> findFieldsByMTI(String MTI) throws PersistenceException;

}
