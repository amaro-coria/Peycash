/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.ColoniaDAO;
import com.peycash.persistence.domain.Colonias;
import com.peycash.persistence.domain.Municipios;

/**
 * Implementation of the interface to access the persistence entity Colonias
 * 
 * @author Aline Ordo&ntilde;ez
 * @version 1.0
 * @since 1.0
 * 
 */
@Repository
public class ColoniaDAOImpl extends BaseDAOImpl<Colonias, Long> implements
		ColoniaDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.peycash.persistence.dao.ColoniaDAO#findByZipCode(String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Colonias> findByZipCode(String zipCode)
			throws PersistenceException {
		List<Colonias> entities = new ArrayList<Colonias>();
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Colonias.class)
					.add(Restrictions.like("cp", zipCode, MatchMode.START));
			entities = criteria.list();
		} catch (Exception e) {
			throw new PersistenceException("Error in findByZipCode:"
					+ e.getMessage(), e);
		}
		return entities;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Colonias> findByName(String query) throws PersistenceException{
		List<Colonias> entities = new ArrayList<Colonias>();
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Colonias.class)
					.add(Restrictions.ilike("nombre", query, MatchMode.START));
			entities = criteria.list();
		} catch (Exception e) {
			throw new PersistenceException("Error in findByName:"
					+ e.getMessage(), e);
		}
		return entities;
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.ColoniaDAO#findByMpio(long)
	 */
	@Override
	public List<Colonias> findByMpio(long idMpio) throws PersistenceException{
		try{
			List<Colonias> entities = new ArrayList<Colonias>();
			try {
				Criteria criteria = getSessionFactory().getCurrentSession()
						.createCriteria(Colonias.class)
						.add(Restrictions.eq("municipios.idMunicipio", idMpio));
				entities = criteria.list();
			} catch (Exception e) {
				throw new PersistenceException("Error in findByName:"
						+ e.getMessage(), e);
			}
			return entities;
		}catch(Exception e){
			throw new PersistenceException("Error in findByMpio:"+e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.ColoniaDAO#findCP(long, java.lang.String)
	 */
	@Override
	public String findCP(long idmpio, String nombre) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Colonias.class)
					.add(Restrictions.eq("municipios.idMunicipio", idmpio));
			criteria.add(Restrictions.ilike("nombre", nombre));
			List<Colonias> list = criteria.list();
			if(CollectionUtils.isEmpty(list)){
				long idColonia = insertNewColonia(nombre, idmpio);
				String cp = getCp(idColonia);
				return cp;
			}else{
				Colonias col = list.get(0);
				String cp = col.getCp();
				return cp;
			}
		}catch(Exception e){
			throw new PersistenceException("Error in findCP:"+e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.ColoniaDAO#findId(long, java.lang.String)
	 */
	@Override
	public long findId(long idmpio, String nombre) throws PersistenceException{
		try{
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(Colonias.class)
					.add(Restrictions.eq("municipios.idMunicipio", idmpio));
			criteria.add(Restrictions.ilike("nombre", nombre));
			List<Colonias> list = criteria.list();
			Colonias col = list.get(0);
			long pk = col.getIdColonia();
			return pk;
		}catch(Exception e){
			throw new PersistenceException("Error in findId:"+e.getMessage(), e);
		}
	}
	
	/**
	 * Retrieves the CP for an existing colonia
	 * @param idColonia the id of the colonia
	 * @return the cp
	 * @throws PersistenceException
	 */
	private String getCp(long idColonia) throws PersistenceException{
		try{
			Colonias cols = super.findByPK(idColonia);
			String cp = cols.getCp();
			return cp;
		}catch(Exception e){
			throw new PersistenceException("Error in getCp:"+e.getMessage(), e);
		}
	}
	
	/**
	 * Inserts a new colonia within the given municipio id
	 * @param nombre the name of the colonia
	 * @param idMpio the id of the municipio
	 * @return the id of the new generated colonia
	 * @throws PersistenceException
	 */
	private long insertNewColonia(String nombre, long idMpio) throws PersistenceException{
		try{
			Municipios mpios = (Municipios) getSessionFactory().getCurrentSession().get(Municipios.class, idMpio);
			Set<Colonias> setCols = mpios.getColoniases();
			String cp = "";
			for(Colonias c : setCols){
				cp = c.getCp();
				break;
			}
			Colonias colonia = new Colonias();
			colonia.setCp(cp);
			colonia.setFechaModificacion(new Date());
			colonia.setMunicipios(mpios);
			colonia.setNombre(nombre);
			colonia.setUsuarioBd("auto-gen");
			long idColonia = (long) getSessionFactory().getCurrentSession().save(colonia);
			return idColonia;
		}catch(Exception e){
			throw new PersistenceException("Error in insertNewColonia:"+e.getMessage(), e);
		}
	}
	

}
