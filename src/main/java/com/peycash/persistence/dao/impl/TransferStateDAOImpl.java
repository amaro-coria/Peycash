/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.peycash.persistence.dao.TransferStateDAO;
import com.peycash.persistence.domain.Transferstate;

/**
 * Implementation of the interface for accessing persistent entities
 * @author Jorge Amaro
 * @version 1.0
 * @since 1.0
 *
 */
@Repository
public class TransferStateDAOImpl extends BaseDAOImpl<Transferstate, Integer>
		implements TransferStateDAO {

}
