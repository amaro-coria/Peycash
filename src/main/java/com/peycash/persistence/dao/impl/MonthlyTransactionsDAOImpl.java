/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.MonthlyTransactionsDAO;
import com.peycash.persistence.domain.Monthlytransactions;

/**
 * Implementation of the interface to access the persistence entity
 * Monthlytransactions
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class MonthlyTransactionsDAOImpl extends
		BaseDAOImpl<Monthlytransactions, Long> implements
		MonthlyTransactionsDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.MonthlyTransactionsDAO#
	 * findTransactionsByCustomerSend(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Monthlytransactions> findTransactionsByCustomerSend(
			long celnumsend) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Monthlytransactions.class);
			criteria.add(Restrictions.eq("celnumsend", celnumsend));
			List<Monthlytransactions> list = criteria.list();
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
	 * @see com.peycash.persistence.dao.MonthlyTransactionsDAO#
	 * findTransactionsByCustomerReceive(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Monthlytransactions> findTransactionsByCustomerReceive(
			long celnumreceive) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Monthlytransactions.class);
			criteria.add(Restrictions.eq("celnumreceive", celnumreceive));
			List<Monthlytransactions> list = criteria.list();
			return list;
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in findTransactionsByCustomerReceive:"
							+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.MonthlyTransactionsDAO#
	 * findTransactionsByCustomerReceiveWithdraw(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Monthlytransactions> findTransactionsByCustomerReceiveWithdraw(
			long celnumreceive) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Monthlytransactions.class);
			criteria.add(Restrictions.eq("celnumreceive", celnumreceive));
			criteria.add(Restrictions.eq("idTransferState", 2));
			List<Monthlytransactions> list = criteria.list();
			return list;
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in findTransactionsByCustomerReceive:"
							+ e.getMessage(), e);
		}
	}

}
