package orders.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import orders.entities.Order;
import orders.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Resource
	OrderService orderService;
		
	@GetMapping
	List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@GetMapping(value = "/{userId}")
	public List<Order> getCartById(@PathVariable(name = "userId") Integer userId) {
		return orderService.getOrderByID(userId);
	}
}
