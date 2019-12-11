package com.serviceloaders.serviceloaderdemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.serviceloaders.serviceloaderdemo.config.ServiceConfig;
import com.serviceloaders.serviceloaderdemo.pinterface.ProviderInterface;
import com.serviceloaders.serviceloaderdemo.service.ProviderService;

@SpringBootApplication
public class ServiceloaderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceloaderDemoApplication.class, args);
		
		
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
	 
	 ProviderService service = context.getBean(ProviderService.class);
	 
	 List<ProviderInterface> providerList = service.getProviders();
	 
	
	 for (ProviderInterface providerService : providerList) {
		
		 providerService.doTask();
	}
	 
	 
	}

}
