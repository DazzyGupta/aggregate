package orders.services;

import java.util.List;

import orders.entities.Order;

public interface OrderService {

	List<Order> getAllOrders();
	
	List<Order> getOrderByID(Integer id);
}
