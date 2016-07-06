/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Terminal;

/**
 * Interface for access to persistence entities of Terminal
 * 
 * @author Aline Ordo\u00f1ez
 * @version 1.0
 * @since 1.0
 * 
 */
public interface TerminalDAO extends BaseDAO<Terminal, Integer> {

	public List<Terminal> findListByIdPartnerShop(int idPartnerShop)
			throws PersistenceException;
}
