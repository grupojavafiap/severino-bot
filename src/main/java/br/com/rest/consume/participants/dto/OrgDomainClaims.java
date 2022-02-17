package br.com.rest.consume.participants.dto;

public class OrgDomainClaims {
	private String organisationAuthorityDomainClaimId;
	private String authorisationDomainName;
	private String authorityId;
	private String authorityName;
	private String registrationId;
	private String status;

	public OrgDomainClaims() {

	}

	public String getOrganisationAuthorityDomainClaimId() {
		return this.organisationAuthorityDomainClaimId;
	}

	public String getAuthorisationDomainName() {
		return this.authorisationDomainName;
	}

	public String getAuthorityId() {
		return this.authorityId;
	}

	public String getAuthorityName() {
		return this.authorityName;
	}

	public String getRegistrationId() {
		return this.registrationId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setOrganisationAuthorityDomainClaimId(String value) {
		this.organisationAuthorityDomainClaimId = value;
	}

	public void setAuthorisationDomainName(String value) {
		this.authorisationDomainName = value;
	}

	public void setAuthorityId(String value) {
		this.authorityId = value;
	}

	public void setAuthorityName(String value) {
		this.authorityName = value;
	}

	public void setRegistrationId(String value) {
		this.registrationId = value;
	}

	public void setStatus(String value) {
		this.status = value;
	}

}