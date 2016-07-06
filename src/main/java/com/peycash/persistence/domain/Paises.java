/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Paises generated by hbm2java
 */
public class Paises implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short idPais;
	private String codigoIso;
	private byte estatus;
	private Set<Estados> estadoses = new HashSet<Estados>(0);

	public Paises() {
	}

	public Paises(short idPais, String codigoIso, byte estatus) {
		this.idPais = idPais;
		this.codigoIso = codigoIso;
		this.estatus = estatus;
	}

	public Paises(short idPais, String codigoIso, byte estatus,
			Set<Estados> estadoses) {
		this.idPais = idPais;
		this.codigoIso = codigoIso;
		this.estatus = estatus;
		this.estadoses = estadoses;
	}

	public short getIdPais() {
		return this.idPais;
	}

	public void setIdPais(short idPais) {
		this.idPais = idPais;
	}

	public String getCodigoIso() {
		return this.codigoIso;
	}

	public void setCodigoIso(String codigoIso) {
		this.codigoIso = codigoIso;
	}

	public byte getEstatus() {
		return this.estatus;
	}

	public void setEstatus(byte estatus) {
		this.estatus = estatus;
	}

	public Set<Estados> getEstadoses() {
		return this.estadoses;
	}

	public void setEstadoses(Set<Estados> estadoses) {
		this.estadoses = estadoses;
	}

}
