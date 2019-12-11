package com.serviceloaders.serviceloaderdemo.provider;

import lombok.Data;

import com.serviceloaders.serviceloaderdemo.pinterface.ProviderInterface;

@Data
public class provider2 implements ProviderInterface{

	public void doTask() {
		// TODO Auto-generated method stub
		System.out.println("Doing task provider2");
	}

}
