/**
 * 
 */
package com.mrfaveo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.mrfaveo.constants.AbstractDatabaseIfc;

/**
 * @author dev
 *
 */
@Entity
@Table(name=AbstractDatabaseIfc.TABLE_EMPLOYEE)
@DiscriminatorValue(AbstractDatabaseIfc.DISCRIMINATOR_USER_EMPLOYEE)
public class Employee extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3392200047347376356L;


}
