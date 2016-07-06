/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Smsprovider;

/**
 * Interface to access persistence entity Smsprovider
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface SMSProviderDAO extends BaseDAO<Smsprovider, Integer> {

	Smsprovider findAvailableSMSProvider() throws PersistenceException;

}
