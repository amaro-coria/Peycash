/**
 * 
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Role;

/**
 * @author amaro
 *
 */
public interface RoleDAO extends BaseDAO<Role, Integer> {
	List<Role> availableRoles(int idUser) throws PersistenceException;
}
