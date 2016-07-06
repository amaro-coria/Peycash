/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.TerminalDAO;
import com.peycash.persistence.domain.Terminal;

/**
 * Implementation of the interface to access the persistence entity Terminal
 * 
 * @author Aline Ordo&ntilde;ez
 * @version 1.0
 * @since 1.0
 * 
 */
@Repository
public class TerminalDAOImpl extends BaseDAOImpl<Terminal, Integer> implements
		TerminalDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TerminalDAO#findListByIdPartnerShop(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Terminal> findListByIdPartnerShop(int idPartnerShop)
			throws PersistenceException {
		List<Terminal> entities = new ArrayList<Terminal>();
		try {
			Criteria criteria = getSessionFactory()
					.getCurrentSession()
					.createCriteria(Terminal.class)
					.add(Restrictions.eq("partnershop.idpartnershops",
							idPartnerShop));
			entities = criteria.list();
		} catch (Exception e) {
			throw new PersistenceException("Error in findListByIdPartnerShop:"
					+ e.getMessage(), e);
		}
		return entities;
	}
}
