/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Domicilios;

/**
 * Interface to access persistence entity Domicilios
 * 
 * @author Aline Ordo\u00f1ez , Jorge Amaro
 * @version 1.2
 * @since 1.0
 * 
 */
public interface DomicilioDAO extends BaseDAO<Domicilios, Long> {

	/**
	 * Gets a readable short address
	 * @param idDomicilio the id of the full address
	 * @return a readable short address
	 * @throws PersistenceException
	 */
	String findShortReadableAddress(long idDomicilio)
			throws PersistenceException;

	/**
	 * Gets the full address
	 * @param idDomicilio the id of the address
	 * @return the full address
	 * @throws PersistenceException
	 */
	String findAddress(long idDomicilio) throws PersistenceException;

	/**
	 * Finds the latitude for locating this zip code
	 * @param idDomicilio the id of the address
	 * @return the latitude
	 * @throws PersistenceException
	 */
	String findLatitude(long idDomicilio) throws PersistenceException;

	/**
	 * Finds the longitude for locating this zip code
	 * @param idDomicilio the if of the address
	 * @return the longitude
	 * @throws PersistenceException
	 */
	String findLongitude(long idDomicilio) throws PersistenceException;

}
