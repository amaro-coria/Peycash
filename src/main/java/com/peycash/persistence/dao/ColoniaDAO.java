/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Colonias;

/**
 * Interface to access persistence entity Colonias.
 * 
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface ColoniaDAO extends BaseDAO<Colonias, Long> {

	/**
	 * Returns the matches of the zip code query
	 * @param zipCode
	 * @return a list of Colonies with the same zip code
	 * @throws PersistenceException
	 */
	public List<Colonias> findByZipCode(String zipCode)
			throws PersistenceException;

	/**
	 * Return the matches of the name query
	 * @param query a query by name
	 * @return  a list of colonies with matching name. Matches "STARTS_WITH"
	 * @throws PersistenceException
	 */
	List<Colonias> findByName(String query) throws PersistenceException;

	/**
	 * Return the matches based on the mpio id
	 * @param idMpio the id
	 * @return the list
	 * @throws PersistenceException
	 */
	List<Colonias> findByMpio(long idMpio) throws PersistenceException;

	/**
	 * Finds the current CP for the given data and inserts the colonia if neccesary
	 * @param idmpio the id of the municipio
	 * @param nombre the name of the colonia
	 * @return the cp
	 * @throws PersistenceException
	 */
	String findCP(long idmpio, String nombre) throws PersistenceException;

	/**
	 * Retrieves the id for the colonia
	 * @param idmpio the id of the municipio
	 * @param nombre the name of the colonia
	 * @return the id
	 * @throws PersistenceException
	 */
	long findId(long idmpio, String nombre) throws PersistenceException;

}
