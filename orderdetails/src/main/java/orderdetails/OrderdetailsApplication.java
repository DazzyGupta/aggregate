package orderdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderdetailsApplication.class, args);
	}
	
	@Bean(name = "restTemp")
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
