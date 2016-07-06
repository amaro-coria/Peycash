/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.TransactionDAO;
import com.peycash.persistence.domain.Transactiondetail;
import com.peycash.persistence.domain.Transactions;
import com.peycash.persistence.domain.Transferstate;

/**
 * Implementation of the interface to access the persistence entity Transactions
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class TransactionDAOImpl extends BaseDAOImpl<Transactions, Long>
		implements TransactionDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TransactionDAO#exitstTransaction(long,
	 * long, java.math.BigDecimal)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean exitstTransaction(long celNumSend, long celNumReceive,
			BigDecimal transferAmount) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			if (celNumSend != 0) {
				criteria.add(Restrictions.eq("celnumsend", celNumSend));
			}
			if (celNumReceive != 0) {
				criteria.add(Restrictions.eq("celnumreceive", celNumReceive));
			}
			criteria.add(Restrictions.eq("transferamount", transferAmount));
			List<Transactions> listTransactions = criteria.list();
			if (CollectionUtils.isEmpty(listTransactions)) {
				return false;
			}
			return true;
		} catch (Exception e) {
			throw new PersistenceException("Error in exitstTransaction :"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDAO#getAutCodeByNoCel_deposit(
	 * long, java.util.Date)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAutCodeByNoCel_deposit(long celNumSend, Date dateTime)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria.add(Restrictions.eq("celnumsend", celNumSend));
			criteria.add(Restrictions.eq("transferstate.idtransferstate", 1));
			criteria.add(Restrictions.gt("dateserver", dateTime));
			List<Transactions> listTransactions = criteria.list();
			if (CollectionUtils.isEmpty(listTransactions)) {
				return null;
			}
			// List<Transactiondetail> listDetails =
			// listTransactions.stream().map(x ->
			// x.getTransactiondetail()).collect(Collectors.toList());
			List<Transactiondetail> listDetails = new ArrayList<Transactiondetail>();
			listTransactions.forEach(x -> x.getTxdetailses().forEach(
					y -> listDetails.add(y.getTransactiondetail())));
			if (CollectionUtils.isEmpty(listDetails)) {
				return null;
			}
			List<String> listAutCodes = listDetails.stream()
					.map(x -> x.getAuthorizationresponse())
					.collect(Collectors.toList());
			if (CollectionUtils.isEmpty(listAutCodes)) {
				return null;
			}
			return listAutCodes;
		} catch (Exception e) {
			throw new PersistenceException("Error in getAutCodeByNoCel :"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDAO#getAutCodeByNoCel_withdraw
	 * (long, java.util.Date)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAutCodeByNoCel_withdraw(long celnumreceive,
			Date dateTime) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria.add(Restrictions.eq("celnumreceive", celnumreceive));
			criteria.add(Restrictions.eq("transferstate.idtransferstate", 2));
			criteria.add(Restrictions.gt("dateserver", dateTime));
			List<Transactions> listTransactions = criteria.list();
			if (CollectionUtils.isEmpty(listTransactions)) {
				return null;
			}
			// List<String> listDetails = listTransactions.stream().map(x ->
			// x.getTransactiondetail().getAuthorizationresponse()).collect(Collectors.toList());
			List<String> listDetails = new ArrayList<String>();
			listTransactions.forEach(x -> x.getTxdetailses().forEach(
					y -> listDetails.add(y.getTransactiondetail()
							.getAuthorizationresponse())));
			return listDetails;
		} catch (Exception e) {
			throw new PersistenceException("Error in getAutCodeByNoCel :"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDAO#getPinSecByNoCel_deposit(long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<String> getPinSecByNoCel_deposit(long celnumreceive)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria.add(Restrictions.eq("celnumreceive", celnumreceive));
			// criteria.add(Restrictions.eq("pinsecurity.isactive", (short)1));
			criteria.add(Restrictions.eq("transferstate.idtransferstate", 1));
			criteria = criteria.createCriteria("pinsecurity");
			criteria.add(Restrictions.eq("active", 1));
			List<Transactions> listTransactions = criteria.list();
			if (CollectionUtils.isEmpty(listTransactions)) {
				return null;
			}
			List<String> listPinSec = listTransactions.stream()
					.map(x -> x.getPinsecurity().getPinsecurity())
					.collect(Collectors.toList());
			return listPinSec;
		} catch (Exception e) {
			throw new PersistenceException("Error in getAutCodeByNoCel :"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDAO#findTransactionForWithdraw
	 * (long, java.lang.String, java.math.BigDecimal)
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public long findTransactionForWithdraw(long celnumreceive, String hashPin,
			BigDecimal transferamount) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria.add(Restrictions.eq("celnumreceive", celnumreceive));
			criteria.add(Restrictions.eq("transferstate.idtransferstate", 1));
			criteria.add(Restrictions.eq("transferamount", transferamount));
			criteria = criteria.createCriteria("pinsecurity");
			criteria.add(Restrictions.eq("pinsecurity", hashPin));
			criteria.add(Restrictions.eq("active", 1));
			List<Transactions> list = criteria.list();
			if (CollectionUtils.isEmpty(list)) {
				return 0;
			}
			return list.get(0).getIdtransactions();
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in findTransactionForWithdraw :" + e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TransactionDAO#generateWithdraw(long)
	 */
	@Override
	public void generateWithdraw(long pkTransaction)
			throws PersistenceException {
		try {
			Transactions tx = findByPK(pkTransaction);
			Transferstate state = new Transferstate();
			state.setIdtransferstate(2);
			tx.setLastupdate(new Date());
			update(tx);
		} catch (Exception e) {
			throw new PersistenceException("Error in generateWithdraw :"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TransactionDAO#findIdPinSecurity(long)
	 */
	@Override
	public long findIdPinSecurity(long id) throws PersistenceException {
		try {
			Transactions tx = findByPK(id);
			long idPin = tx.getPinsecurity().getIdpinsecurity();
			return idPin;
		} catch (Exception e) {
			throw new PersistenceException("Error in findIdPinSecurity :"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TransactionDAO#
	 * findTransctionByTransactiondetailPK(long)
	 */
	@Override
	public long findTransctionByTransactiondetailPK(long pkDetail)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria = criteria.createCriteria("txdetailses");
			criteria = criteria.createCriteria("transactiondetail");
			criteria.add(Restrictions.eq("idtransactiondetail", pkDetail));
			Transactions tx = (Transactions) criteria.uniqueResult();
			long pk = tx.getIdtransactions();
			return pk;
		} catch (Exception e) {
			throw new PersistenceException(
					"Error in findTransctionByTransactiondetailPK :"
							+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TransactionDAO#findTransferState(long)
	 */
	@Override
	public int findTransferState(long pkTransaction)
			throws PersistenceException {
		try {
			Transactions tx = findByPK(pkTransaction);
			int state = tx.getTransferstate().getIdtransferstate();
			return state;
		} catch (Exception e) {
			throw new PersistenceException("Error in findTransferState :"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TransactionDAO#findTxSMSPending()
	 */
	@Override
	public List<Transactions> findTxSMSPending() throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria = criteria.createCriteria("smsqueues");
			criteria.add(Restrictions.eq("smsstatussend.idsmsstatussend", 1));
			List<Transactions> listPendings = criteria.list();
			return listPendings;
		} catch (Exception e) {
			throw new PersistenceException("Error in findTxSMSPending :"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDAO#findTransactions(java.util
	 * .Date, java.util.Date)
	 */
	@Override
	public List<Transactions> findTransactions(Date beginDate, Date endDate)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria.add(Restrictions.between("dateserver", beginDate, endDate));
			criteria = criteria.createCriteria("transferstate");
			List<Transactions> list = criteria.list();
			return list;
		} catch (Exception e) {
			throw new PersistenceException("Error in findTransactions:"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.TransactionDAO#cancellAllTransactions(long)
	 */
	@Override
	public List<Transactions> cancellAllTransactions(long celnumsend)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria.add(Restrictions.eq("celnumsend", celnumsend));
			criteria.add(Restrictions.eq("transferstate.idtransferstate", 1));
			List<Transactions> list = criteria.list();
			Transferstate cancelled = new Transferstate();
			cancelled.setIdtransferstate(4);
			Date lastupdate = new Date();
			for (Transactions tx : list) {
				tx.setTransferstate(cancelled);
				tx.setLastupdate(lastupdate);
				update(tx);
			}
			return list;
		} catch (Exception e) {
			throw new PersistenceException("Error in cancellAllTransactions:"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.TransactionDAO#findByNumCel(long)
	 */
	@Override
	public List<Transactions> findByNumCel(long celnumsend)
			throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Transactions.class);
			criteria.add(Restrictions.eq("celnumsend", celnumsend));
			List<Transactions> list = criteria.list();
			return list;
		} catch (Exception e) {
			throw new PersistenceException("Error in findByNumCel:"
					+ e.getMessage(), e);
		}
	}

}
