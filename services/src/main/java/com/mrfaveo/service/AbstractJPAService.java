/**
 * 
 */
package com.mrfaveo.service;

import javax.persistence.EntityManager;

import com.mrfaveo.entity.GenericEntity;

/**
 * @author dev
 *
 */
public abstract class AbstractJPAService implements JPAService {

	 /**
     * The Entity Manager for persistence operations.
     */
    private EntityManager em;

    public void initialize(EntityManager entityManager)
    {
        this.em = entityManager;
    }
	
	@Override
	public void closeManager() {
		//Container closes the manager

	}

	
	@Override
	public void beginTransaction() {
		// Container does this too

	}

	
	@Override
	public void commitTransaction() {
		// Container does this too

	}

	
	@Override
	public void rollbackTransaction() {
		// Container does this too

	}

	
	@Override
	public void closeFactory() {
		// Container does this too
	}
	
	@Override
	public void persist(GenericEntity entity) {
		em.persist(entity);

	}

	
	@Override
	public GenericEntity merge(GenericEntity entity) {
		
		return em.merge(entity);
	}

	
	@Override
	public void remove(GenericEntity entity) {
		em.remove(entity);

	}

	
	@Override
	public Object find(Class<?> entClass, Object primaryKey) {
		
		return em.find(entClass, primaryKey);
	}

}
