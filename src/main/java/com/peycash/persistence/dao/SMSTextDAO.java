/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Smstext;

/**
 * Interface to access persistence entity Smstext
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface SMSTextDAO extends BaseDAO<Smstext, Integer> {

	/**
	 * Find the active smstext template
	 * 
	 * @return the sms template
	 * 
	 *         <pre>
	 * contains M_QUANTITY for replacement to current quantity of the transfer like 200.00
	 * </pre>
	 * 
	 *         <pre>
	 * contains P_NUMBER for replacement to padded number like XXXXXX1234
	 * </pre>
	 * 
	 *         <pre>
	 * contains PIN_NUMBER for replacement to current pin security number like 1234
	 * </pre>
	 * @throws PersistenceException
	 */
	Smstext findActiveSmstext() throws PersistenceException;

}
