package br.com.rest.consume.participants.dto;

public class Authorisations {
	private String status;
	private String memberState;

	public Authorisations() {

	}

	public String getStatus() {
		return this.status;
	}

	public String getMemberState() {
		return this.memberState;
	}

	public void setStatus(String value) {
		this.status = value;
	}

	public void setMemberState(String value) {
		this.memberState = value;
	}

}