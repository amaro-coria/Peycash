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
import com.peycash.persistence.dao.EstadoDAO;
import com.peycash.persistence.domain.Estados;

/**
 * Implementation of the interface to access the persistence entity Estados
 * 
 * @author Aline Ordo&ntilde;ez
 * @version 1.0
 * @since 1.0
 *
 */
@Repository
public class EstadoDAOImpl extends BaseDAOImpl<Estados, Short> implements
		EstadoDAO {

	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.EstadoDAO#findByNombre(java.lang.String)
	 */
	@Override
	public Estados findByNombre(String nombre) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Estados.class);
			criteria.add(Restrictions.like("nombreEstado", nombre));
			List<Estados> list = criteria.list();
			if(CollectionUtils.isEmpty(list)){
				return null;
			}
			return list.get(0);
		}catch(Exception e){
			throw new PersistenceException("Error in findByNombre:"+e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.EstadoDAO#findByCP(java.lang.String)
	 */
	@Override
	public Estados findByCP(String cp) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Estados.class);
			criteria = criteria.createCriteria("municipioses");
			criteria = criteria.createCriteria("coloniases");
			criteria.add(Restrictions.eq("cp", cp));
			List<Estados> list = criteria.list();
			if(CollectionUtils.isEmpty(list)){
				return null;
			}
			return list.get(0);
		}catch(Exception e){
			throw new PersistenceException("Error in findByNombre:"+e.getMessage(), e);
		}
	}
	
}
