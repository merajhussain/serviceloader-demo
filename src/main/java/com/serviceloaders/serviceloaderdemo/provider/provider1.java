package com.serviceloaders.serviceloaderdemo.provider;

import lombok.Data;

import com.serviceloaders.serviceloaderdemo.pinterface.ProviderInterface;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;

@Data
public class provider1 implements ProviderInterface{

	public void doTask() {
		// TODO Auto-generated method stub


		System.out.println("Doing task provider1");
	}

}
