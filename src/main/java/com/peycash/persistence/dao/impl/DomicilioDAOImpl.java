/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.DomicilioDAO;
import com.peycash.persistence.domain.Colonias;
import com.peycash.persistence.domain.Domicilios;

/**
 * Implementation of the interface to access the persistence entity Domicilios
 * 
 * @author Aline Ordo&ntilde;ez, Jorge Amaro
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class DomicilioDAOImpl extends BaseDAOImpl<Domicilios, Long> implements
		DomicilioDAO {

	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.DomicilioDAO#findLatitude(long)
	 */
	@Override
	public String findLatitude(long idDomicilio) throws PersistenceException{
		try{
			Domicilios domicilio = super.findByPK(idDomicilio);
			Colonias colonia = domicilio.getColonias();
			String latitude = colonia.getLat();
			return latitude;
		}catch(Exception e){
			throw new PersistenceException("Error in findLatitude:"+e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.DomicilioDAO#findLongitude(long)
	 */
	@Override
	public String findLongitude(long idDomicilio) throws PersistenceException{
		try{
			Domicilios domicilio = super.findByPK(idDomicilio);
			Colonias colonia = domicilio.getColonias();
			String longitude = colonia.getLng();
			return longitude;
		}catch(Exception e){
			throw new PersistenceException("Error in findLatitude:"+e.getMessage(), e);
		}
	}
	
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.DomicilioDAO#findShortReadableAddress(long)
	 */
	@Override
	public String findShortReadableAddress(long idDomicilio) throws PersistenceException{
		try{
			Domicilios domicilio = super.findByPK(idDomicilio);
			String nombreDomicilio = domicilio.getColonias().getMunicipios().getNombre();
			String nombreEdo = domicilio.getColonias().getMunicipios().getEstados().getNombreEstado();
			String cp = domicilio.getColonias().getCp();
			String readableAddress = nombreDomicilio + ", " + nombreEdo +", "+ "CP." +  " " + cp;
			return readableAddress;
		}catch(Exception e){
			throw new PersistenceException("Error in findShortReadableAddress:"+e.getMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.peycash.persistence.dao.DomicilioDAO#findAddress(long)
	 */
	@Override
	public String findAddress(long idDomicilio) throws PersistenceException{
		try{
			Domicilios domicilio = super.findByPK(idDomicilio);
			String nombreColonia = domicilio.getColonias().getNombre();
			String nombreDomicilio = domicilio.getColonias().getMunicipios().getNombre();
			String nombreEdo = domicilio.getColonias().getMunicipios().getEstados().getNombreEstado();
			String cp = domicilio.getColonias().getCp();
			String readableAddress = domicilio.getCalleYNum() + ", "+  nombreColonia + ", "+ nombreDomicilio + ", " + nombreEdo + ", CP." + cp;
			return readableAddress;
		}catch(Exception e){
			throw new PersistenceException("Error in findShortReadableAddress:"+e.getMessage(), e);
		}
	}
	
}
