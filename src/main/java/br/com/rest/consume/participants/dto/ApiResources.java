package br.com.rest.consume.participants.dto;

import java.util.List;

public class ApiResources {
	private String apiResourceId;
	private String apiFamilyType;
	private int apiVersion;
	private List<ApiDiscoveryEndpoints> apiDiscoveryEndpoints;

	public ApiResources() {

	}

	public String getApiResourceId() {
		return this.apiResourceId;
	}

	public String getApiFamilyType() {
		return this.apiFamilyType;
	}

	public int getApiVersion() {
		return this.apiVersion;
	}

	public List<ApiDiscoveryEndpoints> getApiDiscoveryEndpoints() {
		return this.apiDiscoveryEndpoints;
	}

	public void setApiResourceId(String value) {
		this.apiResourceId = value;
	}

	public void setApiFamilyType(String value) {
		this.apiFamilyType = value;
	}

	public void setApiVersion(int value) {
		this.apiVersion = value;
	}

	public void setApiDiscoveryEndpoints(List<ApiDiscoveryEndpoints> value) {
		this.apiDiscoveryEndpoints = value;
	}

}