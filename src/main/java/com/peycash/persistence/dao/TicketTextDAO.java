/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Tickettext;

/**
 * Interface to access persistence entity Tickettext
 * 
 * @author Jorge Amaro
 * @author Aline Ordo\u00f1ez
 * @version 1.1
 * @since 1.0
 * 
 */
public interface TicketTextDAO extends BaseDAO<Tickettext, Integer> {

	/**
	 * Gets the latest and active Ticket text entity
	 * 
	 * @return the ticket text entity
	 * @throws PersistenceException
	 */
	Tickettext findLatestActive() throws PersistenceException;

}
