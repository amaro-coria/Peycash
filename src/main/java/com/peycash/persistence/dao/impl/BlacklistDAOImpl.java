package com.peycash.persistence.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.BlacklistDAO;
import com.peycash.persistence.domain.Blacklist;

/**
 * Implementation of the interface to access the persistence entity Blacklist
 * 
 * @author Aline Ordo&ntilde;ez
 * @version 1.0
 * @since 1.0
 * 
 */
@Repository
public class BlacklistDAOImpl extends BaseDAOImpl<Blacklist, Long> implements
		BlacklistDAO {

	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.BlacklistDAO#isPep(java.lang.String, java.lang.String, java.util.Date)
	 */
	@Override
	public boolean isPep(String name, String lastname, Date birthdate) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Blacklist.class);
			criteria.add(Restrictions.like("name", name));
			criteria.add(Restrictions.like("surname", lastname));
			criteria.add(Restrictions.eq("datebirth", birthdate));
			List<Blacklist> list = criteria.list();
			int size = list.size();
			if(size > 0){
				return true;
			}
			return false;
		}catch(Exception e){
			throw new PersistenceException("Error in isPep:"+e.getMessage(),e);
		}
	}
	
}
