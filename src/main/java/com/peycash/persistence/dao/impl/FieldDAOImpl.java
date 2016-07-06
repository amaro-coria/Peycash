/**
 * 
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.FieldDAO;
import com.peycash.persistence.domain.Fields;

/**
 * Implementation of the interface to access the persistence entity Fields
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class FieldDAOImpl extends BaseDAOImpl<Fields, Long> implements FieldDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.peycash.persistence.dao.FieldDAO#findFieldsByMTI(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Fields> findFieldsByMTI(String MTI) throws PersistenceException {
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Fields.class);
			Criteria c2 = criteria.createCriteria("messagefieldses");
			Criteria c3 = c2.createCriteria("messagestructure");
			Criteria c4 = c3.createCriteria("messagetype");
			c4.add(Restrictions.like("MTI", MTI));
			List<Fields> list = c4.list();
			return list;
		} catch (Exception e) {
			throw new PersistenceException("Error in findFieldsByMTI:"
					+ e.getMessage(), e);
		}
	}

}
