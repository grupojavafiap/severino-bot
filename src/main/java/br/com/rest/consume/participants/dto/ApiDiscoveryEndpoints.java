package br.com.rest.consume.participants.dto;

public class ApiDiscoveryEndpoints {
	private String apiDiscoveryId;
	private String apiEndpoint;

	public ApiDiscoveryEndpoints() {

	}

	public String getApiDiscoveryId() {
		return this.apiDiscoveryId;
	}

	public String getApiEndpoint() {
		return this.apiEndpoint;
	}

	public void setApiDiscoveryId(String value) {
		this.apiDiscoveryId = value;
	}

	public void setApiEndpoint(String value) {
		this.apiEndpoint = value;
	}

}