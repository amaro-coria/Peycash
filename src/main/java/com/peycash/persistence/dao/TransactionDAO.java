/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Transactions;

/**
 * Interface to access persistence entity Transactions
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface TransactionDAO extends BaseDAO<Transactions, Long> {

	/**
	 * Check if a transaction exists with given parameters
	 * 
	 * @param celNumSend
	 * @param celNumReceive
	 * @param transferAmount
	 * @return true if a transaction is registered
	 * @throws PersistenceException
	 */
	boolean exitstTransaction(long celNumSend, long celNumReceive,
			BigDecimal transferAmount) throws PersistenceException;

	/**
	 * Gets the aut codes based on the cellular number, the type of transaction
	 * and its status and the date received (timestamp)
	 * 
	 * @param celnumreceive
	 *            - the cellular number that receives the money
	 * @param datetime
	 *            - the datetime to look for (searches for a date greater than
	 *            the received)
	 * @return
	 * @throws PersistenceException
	 */
	List<String> getAutCodeByNoCel_withdraw(long celnumreceive, Date datetime)
			throws PersistenceException;

	/**
	 * Gets the aut codes based on the cellular number, the type of transaction
	 * and its status and the date received (timestamp)
	 * 
	 * @param celNumSend
	 *            - the cellular number that sends the money
	 * @param datetime
	 *            - the datetime to look for (searches for a date greater than
	 *            the received)
	 * @return
	 * @throws PersistenceException
	 */
	List<String> getAutCodeByNoCel_deposit(long celNumSend, Date datetime)
			throws PersistenceException;

	/**
	 * Gets the pin security information for comparison purposes
	 * 
	 * @param celnumreceive
	 *            - the cellular number that receive the transfer
	 * @return the hashed pin security data
	 * @throws PersistenceException
	 */
	List<String> getPinSecByNoCel_deposit(long celnumreceive)
			throws PersistenceException;

	/**
	 * Gets the corresponding transaction if its registered in the system
	 * 
	 * @param celnumreceive
	 * @param hashPin
	 * @param transferamount
	 * @return the ok of the record
	 * @throws PersistenceException
	 */
	long findTransactionForWithdraw(long celnumreceive, String hashPin,
			BigDecimal transferamount) throws PersistenceException;

	/**
	 * Generates the withdraw movement
	 * 
	 * @param pkTransaction
	 * @throws PersistenceException
	 */
	void generateWithdraw(long pkTransaction) throws PersistenceException;

	/**
	 * Finds the related pin security id
	 * 
	 * @param id
	 *            the transaction id
	 * @return the pk of the pin
	 * @throws PersistenceException
	 */
	long findIdPinSecurity(long id) throws PersistenceException;

	/**
	 * Finds a transaction based on its transaction detail PK 
	 * @param pkDetail the PK of the transaction detail
	 * @return the PK of the record
	 * @throws PersistenceException
	 */
	long findTransctionByTransactiondetailPK(long pkDetail)
			throws PersistenceException;

	/**
	 * Retrieves the transferstate for the given transaction
	 * @param pkTransaction the pk of the transaction
	 * @return the id of the transferstate
	 * @throws PersistenceException
	 */
	int findTransferState(long pkTransaction) throws PersistenceException;

	/**
	 * Retrieves the transactions waiting for sms sending
	 * @return the list of transactions
	 * @throws PersistenceException
	 */
	List<Transactions> findTxSMSPending() throws PersistenceException;

	/**
	 * Retrieves the transaction between two dates
	 * @param beginDate the initial date
	 * @param endDate the final date
	 * @return the list of transactions 
	 * @throws PersistenceException
	 */
	List<Transactions> findTransactions(Date beginDate, Date endDate)
			throws PersistenceException;

	/**
	 * Cancels all the transactions for the given number
	 * @param celnumsend the number 
	 * @throws PersistenceException
	 * @return the transactions cancelled
	 */
	 List<Transactions>  cancellAllTransactions(long celnumsend) throws PersistenceException;

	 /**
	 * Finds all the transactions for the given number
	 * @param celnumsend the number 
	 * @throws PersistenceException
	 * @return the transactions send by this cel number
	 */
	 List<Transactions>  findByNumCel(long celnumsend) throws PersistenceException;
}
