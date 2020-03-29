package orderdetails.services.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import orderdetails.entities.Order;
import orderdetails.entities.OrderDetails;
import orderdetails.entities.User;
import orderdetails.services.OrderDetailsService;

@Service
public class DefaultOrderDetailsService implements OrderDetailsService{
	
	@Resource
	private RestTemplate restTemplate;
	
	@Autowired
	private EurekaClient eurekaClient;

	
	public OrderDetails getOrderDetailsById(Integer id) {
		OrderDetails orderDetails = new OrderDetails();
		User user = getUser(id);
		List<Order> orders = getUserOrders(id);
		orderDetails.setUser(user);
		orderDetails.setOrders(orders);
		return orderDetails;
	}
	
	public User getUser(Integer id) {
		 String url = "user/" + id;
	        InstanceInfo userInstance = eurekaClient.getNextServerFromEureka("user", false);
	        User result = restTemplate.getForObject(userInstance.getHomePageUrl() + url, User.class);
	        if(result != null) {
	            return result;
	        }
	        return null;
	}
	
		public List<Order> getUserOrders(Integer id) {
	        String url = "orders/" + id;
	        InstanceInfo orderInstance = eurekaClient.getNextServerFromEureka("orders", false);
	        ResponseEntity<Order[]> result = restTemplate.getForEntity(orderInstance.getHomePageUrl() + url, Order[].class);
	        if(result != null) {
	            List<Order> orders = Arrays.asList(result.getBody());
	            return orders;
	        }
	        return null;
		}
	 
	 	public EurekaClient getEurekaClient() {
	        return eurekaClient;
	    }

	    public void setEurekaClient(EurekaClient eurekaClient) {
	        this.eurekaClient = eurekaClient;
	    }

	    public RestTemplate getRestTemplate() {
	        return restTemplate;
	    }

	    public void setRestTemplate(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

}
