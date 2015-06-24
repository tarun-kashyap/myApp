package com.mrfaveo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.mrfaveo.constants.AbstractDatabaseIfc;


@Entity
@Table(name=AbstractDatabaseIfc.TABLE_CUSTOMER)
@IdClass(CustomerPk.class)
public class Customer implements Serializable{

	/** serial version UID */
	private static final long serialVersionUID = -2309918111554589717L;
	
	@Id
	private long userId;
	
	@Id
	private long customerId;

}
