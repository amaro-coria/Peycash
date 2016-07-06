package com.peycash.persistence.dao;

import java.util.Date;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Blacklist;

/**
 * Interface to access persistence entity Blacklist
 * 
 * @author Aline Ordo\u00f1ez , Jorge Amaro
 * @version 1.1
 * @since 1.0
 *
 */
public interface BlacklistDAO extends BaseDAO<Blacklist, Long> {

	/**
	 * Checks if there is a record about the data 
	 * @param name the name of the customer
	 * @param lastname the last name of the customer
	 * @param birthdate the birthdate of the customer
	 * @return true if there is a record that matches
	 * @throws PersistenceException
	 */
	boolean isPep(String name, String lastname, Date birthdate)
			throws PersistenceException;

}
