/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Customer;

/**
 * Interface to access persistence entity Customer.
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 *
 */
public interface CustomerDAO extends BaseDAO<Customer, Long> {

	/**
	 * Finds the ID of the record based on its cel number
	 * 
	 * @param celNumber
	 * @return the id of the existent record. Return 0 if no record found
	 * @throws PersistenceException
	 */
	long findByNoCel(Long celNumber) throws PersistenceException;

	/**
	 * Checks if the customer is riskiness.
	 * 
	 * @param pkCustomer
	 * @return return true if is riskiness, false otherwise
	 * @throws PersistenceException
	 */
	boolean isCustomerHighRisk(long pkCustomer) throws PersistenceException;

	/**
	 * Checks the customer status based on its id
	 * 
	 * @param pkCustomer
	 * @return <pre>
	 * 1 = Registered
	 * </pre>
	 * 
	 *         <pre>
	 * 2=Register pending
	 * </pre>
	 * 
	 *         <pre>
	 * 3=Temporary blocked
	 * </pre>
	 * 
	 *         <pre>
	 * 4 = PEP
	 * </pre>
	 * 
	 *         .... according to the DB config.
	 * @throws PersistenceException
	 */
	int checkCustomerStatus(long pkCustomer) throws PersistenceException;

	/**
	 * Retrieves the customers that are pending for register
	 * @return the customer list
	 * @throws PersistenceException
	 */
	List<Customer> findRegisterPendings() throws PersistenceException;

}
