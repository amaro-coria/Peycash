/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Partnershop;

/**
 * Interface to access persistence entity Partnershops
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 *
 */
public interface PartnershopDAO extends BaseDAO<Partnershop, Integer> {

	/**
	 * <pre>
	 * Retrieves the ID of the partnershop based on its affiliation field
	 * </pre>
	 * 
	 * <pre>
	 * First make sure that the record actually exists
	 * </pre>
	 * 
	 * @param affiliationPesoExpress
	 * @return the id of the record
	 * @throws PersistenceException
	 */
	int findIdByAffiliation(long affiliationPesoExpress)
			throws PersistenceException;

	/**
	 * Checks if exists a record with the given affiliation
	 * 
	 * @param affiliationPesoExpress
	 * @return true if a record with the given affiliation exists
	 * @throws PersistenceException
	 */
	boolean existsByAffiliation(long affiliationPesoExpress)
			throws PersistenceException;

}
