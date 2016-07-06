/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Monthlytransactions;

/**
 * Interface to access persistence entity Monthlytransactions
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 *
 */
public interface MonthlyTransactionsDAO extends
		BaseDAO<Monthlytransactions, Long> {

	/**
	 * Finds all the transactions related to the given customer
	 * 
	 * @param celnumsend
	 * @return
	 * @throws PersistenceException
	 */
	List<Monthlytransactions> findTransactionsByCustomerSend(long celnumsend)
			throws PersistenceException;

	/**
	 * Finds all the transactions related to the given customer
	 * 
	 * @param celnumreceive
	 * @return
	 * @throws PersistenceException
	 */
	List<Monthlytransactions> findTransactionsByCustomerReceive(
			long celnumreceive) throws PersistenceException;

	/**
	 * Finds the transactions currently withdrawn by the customer
	 * 
	 * @param celnumreceive
	 * @return
	 * @throws PersistenceException
	 */
	List<Monthlytransactions> findTransactionsByCustomerReceiveWithdraw(
			long celnumreceive) throws PersistenceException;

}
