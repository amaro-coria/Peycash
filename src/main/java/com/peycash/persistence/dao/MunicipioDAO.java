/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Municipios;

/**
 * Interface to access persistence entity Municipios
 * 
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface MunicipioDAO extends BaseDAO<Municipios, Long> {

	/**
	 * Retrieves all the municipios matching the estado id
	 * @param idEstado
	 * @return the list
	 * @throws PersistenceException
	 */
	List<Municipios> findByEstado(int idEstado) throws PersistenceException;

	/**
	 * Retrieves all the municipios based on its name and the estado
	 * @param idEstado the id of the estado
	 * @param name the name
	 * @return the list
	 * @throws PersistenceException
	 */
	List<Municipios> findByEstadoAndName(int idEstado, String name)
			throws PersistenceException;

	/**
	 * Retrieve the municipio based on its CP
	 * @param cp the cp
	 * @return the municipio
	 * @throws PersistenceException
	 */
	Municipios findByCP(String cp) throws PersistenceException;

}
