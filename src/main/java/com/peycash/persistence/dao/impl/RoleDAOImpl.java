/**
 * 
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.RoleDAO;
import com.peycash.persistence.domain.Role;

/**
 * @author amaro
 *
 */
@Repository
public class RoleDAOImpl extends BaseDAOImpl<Role, Integer> implements RoleDAO {

	@Override
	public List<Role> availableRoles(int idUser) throws PersistenceException {

		return null;
	}

}
