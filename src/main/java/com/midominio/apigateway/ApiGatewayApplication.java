package com.midominio.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Principal class in spring boot gateway project.
 *
 * @author David G.
 * @version 1.0
 */
@SpringBootApplication
public class ApiGatewayApplication {
	
	/**
	 * Initializer method main.
	 *
	 * @param args parameters.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
