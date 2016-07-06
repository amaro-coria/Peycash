/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.CustomerDAO;
import com.peycash.persistence.domain.Customer;

/**
 * Implementation of the interface to access the persistence entity Customer
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.2
 * @since 1.0
 *
 */
@Repository
public class CustomerDAOImpl extends BaseDAOImpl<Customer, Long> implements
		CustomerDAO {

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.CustomerDAO#findByNoCel(java.lang.Long)
	 */
	@Override
	public long findByNoCel(Long celNumber) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Customer.class);
			criteria.add(Restrictions.eq("celnumber", celNumber));
			// criteria.add(Restrictions.eq("isactive", (short) 1));
			Customer customer = (Customer) criteria.uniqueResult();
			if (customer == null) {
				return 0;
			}
			long pk = customer.getIdcustomer();
			return pk;
		} catch (Exception e) {
			throw new PersistenceException("Error in findByNoCel:"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.CustomerDAO#isCustomerHighRisk(long)
	 */
	@Override
	public boolean isCustomerHighRisk(long pkCustomer)
			throws PersistenceException {
		try {
			Customer customer = findByPK(pkCustomer);
			int idRisk = customer.getCustomerriskiness()
					.getIdcustomerriskiness();
			if (idRisk > 2) {
				return true;
			}
			return false;
		} catch (Exception e) {
			throw new PersistenceException("Error in isCustomerHighRisk:"
					+ e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.CustomerDAO#checkCustomerStatus(long)
	 */
	@Override
	public int checkCustomerStatus(long pkCustomer) throws PersistenceException {
		try {
			Customer customer = findByPK(pkCustomer);
			int idStatus = customer.getCustomerstate().getIdcustomerstate();
			return idStatus;
		} catch (Exception e) {
			throw new PersistenceException("Error in checkCustomerStatus:"
					+ e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.CustomerDAO#findRegisterPendings()
	 */
	@Override
	public List<Customer> findRegisterPendings() throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Customer.class);
			criteria.add(Restrictions.eq("customerstate.idcustomerstate", 2));
			List<Customer> list = criteria.list();
			return list;
		}catch (Exception e) {
			throw new PersistenceException("Error in findRegisterPendings:"
					+ e.getMessage(), e);
		}
	}

}
