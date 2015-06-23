/**
 * 
 */
package order;

import domain.Order;

import org.springframework.stereotype.Component;

/**
 * @author dev
 *
 */
@Component
public interface OrderManager {
	
	public void createOrder(Order order);
	
	public Order viewOrder();
	
	

}
