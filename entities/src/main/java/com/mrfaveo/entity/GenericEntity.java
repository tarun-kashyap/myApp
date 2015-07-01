/**
 * 
 */
package com.mrfaveo.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import com.mrfaveo.constants.AbstractDatabaseIfc;

/**
 * @author dev
 *
 */
@MappedSuperclass
public abstract class GenericEntity implements AbstractDatabaseIfc, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1202852231943931573L;
	
	/**
     * Default public Constructor
     */
    public GenericEntity()
    {
        super();
    }	

}
