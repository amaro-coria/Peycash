/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.DayliTransactionsDAO;
import com.peycash.persistence.domain.Daylitransactions;

/**
 * Implementation of the interface to access the persistence entity
 * Daylitransactions
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class DayliTransactionsDAOImpl extends
		BaseDAOImpl<Daylitransactions, Long> implements DayliTransactionsDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.DayliTransactionsDAO#
	 * findTransactionsByCustomerSend(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Daylitransactions> findTransactionsByCustomerSend(
			long celnumsend) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Daylitransactions.class);
			criteria.add(Restrictions.eq("celnumsend", celnumsend));
			List<Daylitransactions> list = criteria.list();
			return list;
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in findTransactionsByCustomerSend:" + e.getMessage(),
					e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.DayliTransactionsDAO#
	 * findTransactionsByCustomerReceive(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Daylitransactions> findTransactionsByCustomerReceive(
			long celnumreceive) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Daylitransactions.class);
			criteria.add(Restrictions.eq("celnumreceive", celnumreceive));
			List<Daylitransactions> list = criteria.list();
			return list;
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in findTransactionsByCustomerSend:" + e.getMessage(),
					e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.DayliTransactionsDAO#
	 * findTransactionsByCustomerReceiveWithdraw(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Daylitransactions> findTransactionsByCustomerReceiveWithdraw(
			long celnumreceive) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Daylitransactions.class);
			criteria.add(Restrictions.eq("celnumreceive", celnumreceive));
			criteria.add(Restrictions.eq("idTransferState", 2));
			List<Daylitransactions> list = criteria.list();
			return list;
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in findTransactionsByCustomerSend:" + e.getMessage(),
					e);
		}
	}

}
