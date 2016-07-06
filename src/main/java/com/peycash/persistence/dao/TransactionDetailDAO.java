/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Transactiondetail;

/**
 * Interface to access persistence entity Transactiondetail
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface TransactionDetailDAO extends BaseDAO<Transactiondetail, Long> {

	/**
	 * Checks if a transaction detail exists with given parameters
	 * 
	 * @param auditNumber
	 * @param referenceNumber
	 * @param amount
	 * @param date
	 * @return true if exists
	 * @throws PersistenceException
	 */
	boolean existsTransactionDetail(int auditNumber, String referenceNumber,
			BigDecimal amount, Date date) throws PersistenceException;

	/**
	 * Checks if a transaction detail exists with given parameters
	 * 
	 * @param auditNumber
	 * @param referenceNumber
	 * @param amount
	 * @param terminalid
	 * @param storeid
	 * @param companyid
	 * @param date
	 * @return true if exists
	 * @throws PersistenceException
	 */
	boolean existsTransactionDetailDeep(int auditNumber,
			String referenceNumber, BigDecimal amount, String terminalid,
			int storeid, int companyid, Date date) throws PersistenceException;

	/**
	 * Finds the current ID of the record for a transaction that accomplish the
	 * parameters no matter if it has ben already reversed
	 * 
	 * @param auditNumber
	 * @param referenceNumber
	 * @param amount
	 * @param terminalid
	 * @param storeid
	 * @param companyid
	 * @param date
	 * @param authorizationresponse
	 * @param uniqueIdTx
	 * @return the id of the record no matter if it has been already reversed
	 * @throws PersistenceException
	 */
	long existsTransactionDetailDeep(int auditNumber, String referenceNumber,
			BigDecimal amount, String terminalid, int storeid, int companyid,
			Date date, String authorizationresponse, Long uniqueIdTx)
			throws PersistenceException;

	/**
	 * Finds the previous authorization response for a given transaction detail
	 * 
	 * @param pkDetail
	 * @return
	 * @throws PersistenceException
	 */
	String findAutResponse(long pkDetail) throws PersistenceException;

	/**
	 * Finds the current related transaction details based on root transaction id
	 * @param pkTransactionRoot the id of the root transaction
	 * @return the list of the related details
	 * @throws PersistenceException
	 */
	List<Transactiondetail> findTransactionDetailsByRoot(long pkTransactionRoot)
			throws PersistenceException;

}
