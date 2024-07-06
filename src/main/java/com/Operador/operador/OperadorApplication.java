package com.Operador.operador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class OperadorApplication {

		@Bean
		@LoadBalanced
		 RestTemplate restTemplate() {
			return new RestTemplate();
		}

	public static void main(String[] args) {
		SpringApplication.run(OperadorApplication.class, args);
	}
}
