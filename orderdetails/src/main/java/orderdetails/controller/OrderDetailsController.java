package orderdetails.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import orderdetails.entities.OrderDetails;
import orderdetails.services.OrderDetailsService;

@RestController
@RequestMapping(value = "/orderdetails")
public class OrderDetailsController {

	@Resource
	OrderDetailsService orderDetailsService;
	
	@GetMapping(value = "/{id}")
	OrderDetails getOrderDetailsDetailsById(@PathVariable(name = "id") Integer id) {
		return orderDetailsService.getOrderDetailsById(id);
	}
}
