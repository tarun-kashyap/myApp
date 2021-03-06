/**
 * 
 */
package com.mrfaveo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mrfaveo.entity.User;

/**
 * @author dev
 *
 */
@Repository("userDAO")
@Transactional(propagation=Propagation.REQUIRED)
public class UserDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void insert(User user) {
		getEntityManager().persist(user);
	}
	
	public void update(User user)
	{
		getEntityManager().merge(user);
	}

}
