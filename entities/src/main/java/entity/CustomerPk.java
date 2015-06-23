/**
 * 
 */
package entity;

import java.io.Serializable;

/**
 * @author dev
 *
 */
public class CustomerPk implements Serializable {

	/** serial version UID */
	private static final long serialVersionUID = 1640577537086384669L;
	
	private long userId;
	
	private long customerId;
	
	public CustomerPk(long userId, long customerId)
	{
		this.userId = userId;
		this.customerId = customerId;
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public int hashCode() {
		
		return (int) (userId+customerId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof CustomerPk))
		{
			return false;
		}
		CustomerPk otherKey = (CustomerPk) obj;
		return this.getUserId() == otherKey.getUserId() && this.getCustomerId() == otherKey.getCustomerId();
	}

}
