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
import com.peycash.persistence.dao.MunicipioDAO;
import com.peycash.persistence.domain.Municipios;

/**
 * Implementation of the interface to access the persistence entity Municipios
 * 
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 * 
 */
@Repository
public class MunicipioDAOImpl extends BaseDAOImpl<Municipios, Long>
		implements MunicipioDAO {
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.MunicipioDAO#findByEstado(int)
	 */
	@Override
	public List<Municipios> findByEstado(int idEstado) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Municipios.class);
			criteria.add(Restrictions.eq("estados.idEstado", (short)idEstado));
			List<Municipios> list = criteria.list();
			return list;
		}catch(Exception e){
			throw new PersistenceException("Error in findByEstado:"+e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.MunicipioDAO#findByEstadoAndName(int, java.lang.String)
	 */
	@Override
	public List<Municipios> findByEstadoAndName(int idEstado, String name) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Municipios.class);
			criteria.add(Restrictions.eq("estados.idEstado", (short)idEstado));
			criteria.add(Restrictions.ilike("nombre", name));
			List<Municipios> list = criteria.list();
			return list;
		}catch(Exception e){
			throw new PersistenceException("Error in findByEstado:"+e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.MunicipioDAO#findByCP(java.lang.String)
	 */
	@Override
	public Municipios findByCP(String cp) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Municipios.class);
			criteria = criteria.createCriteria("coloniases");
			criteria.add(Restrictions.eq("cp", cp));
			List<Municipios> list = criteria.list();
			if(CollectionUtils.isEmpty(list)){
				return null;
			}
			return list.get(0);
		}catch(Exception e){
			throw new PersistenceException("Error in findByEstado:"+e.getMessage(), e);
		}
	}
}
