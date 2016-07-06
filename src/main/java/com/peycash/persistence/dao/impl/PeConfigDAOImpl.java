/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.PeConfigDAO;
import com.peycash.persistence.domain.Peconfig;

/**
 * Implementation of the interface to access the persistence entity Peconfig
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class PeConfigDAOImpl extends BaseDAOImpl<Peconfig, Long> implements
		PeConfigDAO {

	/**
	 * Injected value from properties. Identifier of the expected configuration
	 * for iso8583
	 */
	@Value("${id_config_iso8583}")
	private String idconfig;


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.PeConfigDAO#findISOConfig()
	 */
	public Peconfig findISOConfig() throws PersistenceException {
		try {
			Peconfig config = super.findByPK(Long.parseLong(idconfig));
			return config;
		} catch (Exception e) {
			throw new PersistenceException(
					"No se pudo encontrar el registro con la configuracion para el servidor iso",
					e);
		}
	}

	/**
	 * @return the idconfig
	 */
	public String getIdconfig() {
		return idconfig;
	}

	/**
	 * @param idconfig
	 *            the idconfig to set
	 */
	public void setIdconfig(String idconfig) {
		this.idconfig = idconfig;
	}
}
