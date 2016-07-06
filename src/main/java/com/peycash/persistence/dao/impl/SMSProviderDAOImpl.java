/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.SMSProviderDAO;
import com.peycash.persistence.domain.Smsprovider;

/**
 * Implementation of the interface to access the persistence entity SMSProvider
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class SMSProviderDAOImpl extends BaseDAOImpl<Smsprovider, Integer>
		implements SMSProviderDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.impl.SMSProviderDAO#findAvailableSMSProvider
	 * ()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Smsprovider findAvailableSMSProvider() throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Smsprovider.class);
			criteria.add(Restrictions.eq("smsstatus.idsmsstatus", 1));
			criteria.add(Restrictions.gt("idsmsbalance", 0));
			List<Smsprovider> listProviders = criteria.list();
			if (CollectionUtils.isEmpty(listProviders)) {
				return null;
			}
			return listProviders.get(0);
		} catch (Exception e) {
			throw new PersistenceException("Error in findAvailableSMSProvider:"
					+ e.getMessage(), e);
		}
	}
}
