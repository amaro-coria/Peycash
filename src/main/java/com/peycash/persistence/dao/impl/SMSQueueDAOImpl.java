/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.SMSQueueDAO;
import com.peycash.persistence.domain.Smsqueue;
import com.peycash.persistence.domain.Smsstatussend;

/**
 * Implementation of the interface to access the persistence entity Smsqueue
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class SMSQueueDAOImpl extends BaseDAOImpl<Smsqueue, Long> implements
		SMSQueueDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.SMSQueueDAO#cancellSMS(long)
	 */
	@Override
	public boolean cancellSMS(long idTransactionRoot)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Smsqueue.class);
			criteria = criteria.createCriteria("transactions");
			criteria.add(Restrictions.eq("idtransactions", idTransactionRoot));
			Smsqueue sms = (Smsqueue) criteria.uniqueResult();
			Smsstatussend status = sms.getSmsstatussend();
			if (status.getIdsmsstatussend() == 2) {
				return false;
			}
			Smsstatussend statusNew = new Smsstatussend();
			statusNew.setIdsmsstatussend(3);
			sms.setSmsstatussend(statusNew);
			update(sms);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.SMSQueueDAO#findByTxId(long)
	 */
	@Override
	public Smsqueue findByTxId(long idtransactions) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Smsqueue.class);
			criteria.add(Restrictions.eq("transactions.idtransactions", idtransactions));
			Smsqueue sms = (Smsqueue) criteria.uniqueResult();
			return sms;
		}catch(Exception e){
			throw new PersistenceException("Error in findByTxId:"+e.getMessage(), e);
		}
	}

}
