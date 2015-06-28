package com.mrfaveo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.mrfaveo.constants.AbstractDatabaseIfc;

@Entity
@Table(name=AbstractDatabaseIfc.TABLE_PROFESSIONAL)
@DiscriminatorValue(AbstractDatabaseIfc.DISCRIMINATOR_USER_PROFESSIONAL)
public class ServiceProfessional extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2378629764611856089L;
	

}
