/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.PartnershopDAO;
import com.peycash.persistence.domain.Partnershop;

/**
 * Implementation of the interface to access the persistence entity Partnershop
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class PartnershopDAOImpl extends BaseDAOImpl<Partnershop, Integer>
		implements PartnershopDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.PartnershopDAO#findIdByAffiliation(long)
	 */
	@Override
	public int findIdByAffiliation(long affiliationPesoExpress)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Partnershop.class);
			criteria.add(Restrictions.eq("affiliationpesoexpress",
					affiliationPesoExpress));
			criteria.add(Restrictions.eq("isactivied", (short) 1));
			Partnershop partnershop = (Partnershop) criteria.uniqueResult();
			return partnershop.getIdpartnershops();
		} catch (Exception e) {
			throw new PersistenceException("Error in findIdByAffiliation:"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.PartnershopDAO#existsByAffiliation(long)
	 */
	@Override
	public boolean existsByAffiliation(long affiliationPesoExpress)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Partnershop.class);
			criteria.add(Restrictions.eq("affiliationpesoexpress",
					affiliationPesoExpress));
			criteria.add(Restrictions.eq("isactivied", (short) 1));
			Partnershop partnershop = (Partnershop) criteria.uniqueResult();
			if (partnershop == null) {
				return false;
			}
			return true;
		} catch (Exception e) {
			throw new PersistenceException("Error in findIdByAffiliation:"
					+ e.getMessage(), e);
		}
	}
}
