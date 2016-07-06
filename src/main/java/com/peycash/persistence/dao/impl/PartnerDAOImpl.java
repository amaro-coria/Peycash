/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.PartnerDAO;
import com.peycash.persistence.domain.Partner;

/**
 * Implementation of the interface to access the persistence entity Partner
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class PartnerDAOImpl extends BaseDAOImpl<Partner, Integer> implements
		PartnerDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.PartnerDAO#findIdByAffiliation(long)
	 */
	@Override
	public int findIdByAffiliation(long affiliationPesoExpress)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Partner.class);
			criteria.add(Restrictions.eq("affiliationpesoexpress",
					affiliationPesoExpress));
			criteria.add(Restrictions.eq("isactivied", (short) 1));
			Partner partner = (Partner) criteria.uniqueResult();
			int idPartner = partner.getIdpartner();
			return idPartner;
		} catch (Exception e) {
			throw new PersistenceException("Error in fingIdByAffiliation:"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.PartnerDAO#existsByAffiliation(long)
	 */
	@Override
	public boolean existsByAffiliation(long affiliationPesoExpress)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Partner.class);
			criteria.add(Restrictions.eq("affiliationpesoexpress",
					affiliationPesoExpress));
			criteria.add(Restrictions.eq("isactivied", (short) 1));
			Partner partner = (Partner) criteria.uniqueResult();
			if (partner == null) {
				return false;
			}
			return true;
		} catch (Exception e) {
			throw new PersistenceException("Error in fingIdByAffiliation:"
					+ e.getMessage(), e);
		}
	}
}
