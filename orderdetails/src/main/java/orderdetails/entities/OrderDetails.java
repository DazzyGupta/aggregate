package orderdetails.entities;

import java.util.List;

public class OrderDetails {
	
	private User user;
	
	private List<Order> orders;
	
	public OrderDetails() {}
	
	public OrderDetails(User user, List<Order> orders) {
		this.user=user;
		this.orders=orders;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
