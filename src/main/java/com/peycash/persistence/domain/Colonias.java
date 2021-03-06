/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Colonias generated by hbm2java
 */
public class Colonias implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idColonia;
	private Municipios municipios;
	private String nombre;
	private String usuarioBd;
	private Date fechaModificacion;
	private String cp;
	private String lat;
	private String lng;
	private Set<Domicilios> domicilioses = new HashSet<Domicilios>(0);

	public Colonias() {
	}

	public Colonias(long idColonia, Municipios municipios, String nombre,
			String usuarioBd, Date fechaModificacion, String cp) {
		this.idColonia = idColonia;
		this.municipios = municipios;
		this.nombre = nombre;
		this.usuarioBd = usuarioBd;
		this.fechaModificacion = fechaModificacion;
		this.cp = cp;
	}

	public Colonias(int idColonia, Municipios municipios, String nombre,
			String usuarioBd, Date fechaModificacion, String cp,
			Set<Domicilios> domicilioses) {
		this.idColonia = idColonia;
		this.municipios = municipios;
		this.nombre = nombre;
		this.usuarioBd = usuarioBd;
		this.fechaModificacion = fechaModificacion;
		this.cp = cp;
		this.domicilioses = domicilioses;
	}

	public long getIdColonia() {
		return this.idColonia;
	}

	public void setIdColonia(long idColonia) {
		this.idColonia = idColonia;
	}

	public Municipios getMunicipios() {
		return this.municipios;
	}

	public void setMunicipios(Municipios municipios) {
		this.municipios = municipios;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuarioBd() {
		return this.usuarioBd;
	}

	public void setUsuarioBd(String usuarioBd) {
		this.usuarioBd = usuarioBd;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public Set<Domicilios> getDomicilioses() {
		return this.domicilioses;
	}

	public void setDomicilioses(Set<Domicilios> domicilioses) {
		this.domicilioses = domicilioses;
	}

	/**
	 * @return the lat
	 */
	public String getLat() {
		return lat;
	}

	/**
	 * @param lat the lat to set
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}

	/**
	 * @return the lng
	 */
	public String getLng() {
		return lng;
	}

	/**
	 * @param lng the lng to set
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}

}
