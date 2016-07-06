/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Daylitransactions;

/**
 * Interface to access persistence entity Daylitransactions
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 *
 */
public interface DayliTransactionsDAO extends BaseDAO<Daylitransactions, Long> {

	/**
	 * Finds the transactions related to the given customer
	 * 
	 * @param celnumsend
	 * @return the list
	 * @throws PersistenceException
	 */
	List<Daylitransactions> findTransactionsByCustomerSend(long celnumsend)
			throws PersistenceException;

	/**
	 * Finds the transactions related to the given customer
	 * 
	 * @param celnumreceive
	 * @return the list
	 * @throws PersistenceException
	 */
	List<Daylitransactions> findTransactionsByCustomerReceive(long celnumreceive)
			throws PersistenceException;

	/**
	 * Finds the transactions that were actually withdrawn by the customer
	 * 
	 * @param celnumreceive
	 * @return the list
	 * @throws PersistenceException
	 */
	List<Daylitransactions> findTransactionsByCustomerReceiveWithdraw(
			long celnumreceive) throws PersistenceException;

}
