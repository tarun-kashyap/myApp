package com.mrfaveo.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.mrfaveo.constants.AbstractDatabaseIfc;


@Entity
@Table(name=AbstractDatabaseIfc.TABLE_CUSTOMER)
@DiscriminatorValue(AbstractDatabaseIfc.DISCRIMINATOR_USER_CUSTOMER)
public class Customer extends User implements Serializable{

	/** serial version UID */
	private static final long serialVersionUID = -2309918111554589717L;
	


}
