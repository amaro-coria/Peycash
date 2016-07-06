/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Smsqueue;

/**
 * Interface to access persistence entity Smsqueue
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface SMSQueueDAO extends BaseDAO<Smsqueue, Long> {

	/**
	 * Try to cancel an SMS
	 * 
	 * @param idTransactionRoot
	 *            the id of the origin transaction
	 * @return true if the sms could be cancelled, false otherwise
	 * @throws PersistenceException
	 */
	boolean cancellSMS(long idTransactionRoot) throws PersistenceException;

	/**
	 * Retrieves the current sms based on its transaction id
	 * @param idtransactions the id of the parent transaction
	 * @return the smsqueue instance
	 * @throws PersistenceException
	 */
	Smsqueue findByTxId(long idtransactions) throws PersistenceException;

}
