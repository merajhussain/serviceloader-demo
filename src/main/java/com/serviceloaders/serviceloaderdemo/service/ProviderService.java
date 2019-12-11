package com.serviceloaders.serviceloaderdemo.service;

import java.util.List;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.serviceloaders.serviceloaderdemo.pinterface.ProviderInterface;

@Service
@Slf4j
@Data
public class ProviderService {
	
	@Autowired
	@Qualifier("providerListBean")
	private List<ProviderInterface> providers;

	public List<ProviderInterface> getProviders() {
		return providers;
	}

	public void setProviders(List<ProviderInterface> providers) {
		this.providers = providers;
	}
	
	
	
	
}
