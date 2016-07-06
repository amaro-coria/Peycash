/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.TicketTextDAO;
import com.peycash.persistence.domain.Tickettext;

/**
 * Implementation of the interface to access the persistence entity Tickettext
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class TicketTextDAOImpl extends BaseDAOImpl<Tickettext, Integer>
		implements TicketTextDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TicketTextDAO#findLatestActive()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Tickettext findLatestActive() throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Tickettext.class);
			criteria.add(Restrictions.eq("tactive", (short) 1));
			criteria.addOrder(Order.desc("idTtext"));
			List<Tickettext> list = criteria.list();
			if (CollectionUtils.isEmpty(list)) {
				throw new PersistenceException("No ticket text found");
			}
			Tickettext tt = list.get(0);
			return tt;
		} catch (Exception e) {
			throw new PersistenceException("Error in findLatestActive:"
					+ e.getMessage(), e);
		}
	}

}
