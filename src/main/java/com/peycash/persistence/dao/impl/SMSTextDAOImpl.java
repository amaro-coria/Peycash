/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.SMSTextDAO;
import com.peycash.persistence.domain.Smstext;

/**
 * Implementation of the interface to access the persistence entity Smstext
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class SMSTextDAOImpl extends BaseDAOImpl<Smstext, Integer> implements
		SMSTextDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.SMSTextDAO#findActiveSmstext()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Smstext findActiveSmstext() throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Smstext.class);
			criteria.add(Restrictions.eq("activeSms", (short) 1));
			criteria.addOrder(Order.desc("idSms"));
			List<Smstext> list = criteria.list();
			Smstext text = list.get(0);
			return text;
		} catch (Exception e) {
			throw new PersistenceException("Error in findActiveSmstext"
					+ e.getMessage(), e);
		}
	}

}
