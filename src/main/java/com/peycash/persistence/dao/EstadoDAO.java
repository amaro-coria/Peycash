/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Estados;

/**
 * Interface to access persistence entity Estados
 * 
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface EstadoDAO extends BaseDAO<Estados, Short> {

	/**
	 * Finds an estado with the given name
	 * @param nombre
	 * @return the matching estado by name
	 * @throws PersistenceException
	 */
	Estados findByNombre(String nombre) throws PersistenceException;

	/**
	 * Find the estado by CP
	 * @param cp the cp
	 * @return the estado
	 * @throws PersistenceException
	 */
	Estados findByCP(String cp) throws PersistenceException;

}
