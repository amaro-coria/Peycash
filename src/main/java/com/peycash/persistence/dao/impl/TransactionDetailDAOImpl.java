/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.TransactionDetailDAO;
import com.peycash.persistence.domain.Transactiondetail;

/**
 * Implementation of the interface to access the persistence entity
 * Transactiondetail
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class TransactionDetailDAOImpl extends
		BaseDAOImpl<Transactiondetail, Long> implements TransactionDetailDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDetailDAO#existsTransactionDetail
	 * (int, java.lang.String, java.math.BigDecimal, java.util.Date)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean existsTransactionDetail(int auditNumber,
			String referenceNumber, BigDecimal amount, Date date)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactiondetail.class);
			criteria.add(Restrictions.eq("auditnumber", auditNumber));
			criteria.add(Restrictions.eq("referencenumber", referenceNumber));
			if(amount.intValue() != 0){
				criteria.add(Restrictions.eq("amounttrx", amount));
			}
			criteria.add(Restrictions.like("serverdate", date));
			List<Transactiondetail> listTransactionsDetail = criteria.list();
			if (CollectionUtils.isEmpty(listTransactionsDetail)) {
				return false;
			}
			return true;
		} catch (Exception e) {
			throw new PersistenceException("Error in existsTransactionDetail:"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDetailDAO#existsTransactionDetailDeep
	 * (int, java.lang.String, java.math.BigDecimal, java.lang.String, int, int,
	 * java.util.Date)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean existsTransactionDetailDeep(int auditNumber,
			String referenceNumber, BigDecimal amount, String terminalid,
			int storeid, int companyid, Date date) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactiondetail.class);
			criteria.add(Restrictions.eq("auditnumber", auditNumber));
			criteria.add(Restrictions.eq("referencenumber", referenceNumber));
			if(amount.intValue() != 0){
				criteria.add(Restrictions.eq("amounttrx", amount));
			}
			criteria.add(Restrictions.eq("terminalid", terminalid));
			criteria.add(Restrictions.eq("storeid", storeid));
			criteria.add(Restrictions.like("serverdate", date));
			criteria.add(Restrictions.eq("companyid", companyid));
			List<Transactiondetail> listTransactionsDetail = criteria.list();
			if (CollectionUtils.isEmpty(listTransactionsDetail)) {
				return false;
			}
			return true;
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in existsTransactionDetailDeep:" + e.getMessage(), e);
		}
	}

	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.TransactionDetailDAO#existsTransactionDetailDeep(int, java.lang.String, java.math.BigDecimal, java.lang.String, int, int, java.util.Date, java.lang.String, java.lang.Long)
	 */
	@Override
	public long existsTransactionDetailDeep(int auditNumber,
			String referenceNumber, BigDecimal amount, String terminalid,
			int storeid, int companyid, Date date, String authorizationresponse, Long uniqueIdTx)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactiondetail.class);
			criteria.add(Restrictions.eq("auditnumber", auditNumber));
			criteria.add(Restrictions.eq("referencenumber", referenceNumber));
			if(amount != null){
				criteria.add(Restrictions.eq("amounttrx", amount));
			}
			if(uniqueIdTx != null){
				criteria.add(Restrictions.eq("uniqueidtransaction", uniqueIdTx));
			}
			criteria.add(Restrictions.eq("terminalid", terminalid));
			criteria.add(Restrictions.eq("storeid", storeid));
			criteria.add(Restrictions.like("serverdate", date));
			criteria.add(Restrictions.eq("companyid", companyid));
			if (authorizationresponse.trim().length() > 2) {
				criteria.add(Restrictions.le("authorizationresponse",
						authorizationresponse));
			}
			Transactiondetail transactionsDetail = (Transactiondetail) criteria
					.uniqueResult();
			long pk = transactionsDetail.getIdtransactiondetail();
			return pk;
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in existsTransactionDetailDeep:" + e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDetailDAO#findAutResponse(long)
	 */
	@Override
	public String findAutResponse(long pkDetail) throws PersistenceException {
		try {
			Transactiondetail detail = findByPK(pkDetail);
			String response = detail.getAuthorizationresponse();
			return response;
		} catch (Exception e) {
			throw new PersistenceException("Error in findAutResponse:"
					+ e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.TransactionDetailDAO#findTransactionDetailsByRoot(long)
	 */
	@Override
	public List<Transactiondetail> findTransactionDetailsByRoot(long pkTransactionRoot) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Transactiondetail.class);
			criteria = criteria.createCriteria("txdetailses");
			criteria.add(Restrictions.eq("transactions.idtransactions", pkTransactionRoot));
			List<Transactiondetail> listDetails = criteria.list();
			return listDetails;
		}catch(Exception e){
			throw new PersistenceException("Error in findTransactionDetailsByRoot:"+e.getMessage(), e);
		}
	}

}
