package com.serviceloaders.serviceloaderdemo.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.serviceloader.ServiceListFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.serviceloaders.serviceloaderdemo.pinterface.ProviderInterface;

@Slf4j
@Configuration
@ComponentScan(value = {"com.serviceloaders.serviceloaderdemo.service"})
public class ServiceConfig {
	
	
	@Bean
    public ServiceListFactoryBean providerListBean() {
        ServiceListFactoryBean serviceListFactoryBean = new ServiceListFactoryBean();
        serviceListFactoryBean.setServiceType(ProviderInterface.class);
        serviceListFactoryBean.setSingleton(true);
       // log.debug("Covisint Message Delivery Provider Factory loaded.");
        return serviceListFactoryBean;
    }
	
	
}
