package orders.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import orders.entities.Order;
import orders.services.OrderService;

@Service
public class DefaultOrderService implements OrderService{
	
	@Resource
	private RestTemplate restTemplate;

	List<Order> orders = new ArrayList<Order>() {{
	add(new Order(1,1,1200.0F,"14-Apr-2020"));
	add(new Order(2,1,5000.0F,"13-Apr-2020"));
	add(new Order(3,2,1500.0F,"12-Apr-2020"));
	add(new Order(4,2,200.0F,"11-Apr-2020"));
}};
	
	public List<Order> getAllOrders(){
		return orders;
	}

	public List<Order> getOrderByID(Integer id) {
		List<Order> orders = null;
		Stream<Order> resultOrder = getAllOrders().stream()
				.filter(c -> id.equals(c.getUserId()));
		orders = resultOrder.collect(Collectors.toList());
			return orders;
	}
}
