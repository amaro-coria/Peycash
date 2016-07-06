package com.peycash.persistence.dao;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.User;

public interface UserDAO extends BaseDAO<User, Integer> {
	User findByUserName(String username) throws PersistenceException;
}
