/**
 * 
 */
package com.mrfaveo.service;

import com.mrfaveo.entity.GenericEntity;

/**
 * @author dev
 *
 */
public interface JPAService {
	
	 /** The persistence unit name; the text connects this sevice to the 
     *  to the persistence unit defined in the persistence.xml file.  */
    public static final String PERSISTENCE_UNIT_NAME = "myApp";

    /**
     * Closes the EntityManager if appropriate for
     * the implementation.
     */
    public void closeManager();
    
    /**
     * Encapsulates the start of a transaction.
     */
    public void beginTransaction();

    /**
     * Encapsulates the end of a transaction.
     */
    public void commitTransaction();

    /**
     * Encapsulates the roll back of a failed transaction.
     */
    public void rollbackTransaction();
    
   
    /**
     * Closes the EntityManagerFactory if appropriate for 
     * the implementation.
     */
    public void closeFactory();    
    
    
    
    /**
     * Persists the entity. Application Managed contexts provide transaction
     * support for the operation; in container managed contexts, the container 
     * provides transaction control.
     * @param entity to be persisted
     */
    public void persist(GenericEntity entity);
    
    /**
     * Merges the entity.  Application Managed contexts provide transaction
     * support for the operation; in container managed contexts, the container 
     * provides transaction control.
     * @param entity to be merged
     */
    public GenericEntity merge(GenericEntity entity);
    
    /**
     * Removes the entity.  Application Managed contexts provide transaction
     * support for the operation; in container managed contexts, the container 
     * provides transaction control.
     * @param entity to be removed
     */
    public void remove(GenericEntity entity);
    
   
     /**
     * This method encapsulates the retrieval of an entity by it's primary key.
     * @param entClass the entity class
     * @param primaryKey the primary key
     * @return the found entity instance or null if the entity does not exist
     */
     public Object find(Class<?> entClass, Object primaryKey);
    
   
}
