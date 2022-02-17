package br.com.rest.consume.participants.dto;

import java.util.List;

public class OrgDomainRoleClaims {
	private String organisationId;
	private String organisationAuthorityClaimId;
	private String authorityId;
	private String status;
	private String authorisationDomain;
	private String role;
	private List<Authorisations> authorisations;
	private String registrationId;
	private List<String> uniqueTechnicalIdenifier;

	public OrgDomainRoleClaims() {

	}

	public String getOrganisationId() {
		return this.organisationId;
	}

	public String getOrganisationAuthorityClaimId() {
		return this.organisationAuthorityClaimId;
	}

	public String getAuthorityId() {
		return this.authorityId;
	}

	public String getStatus() {
		return this.status;
	}

	public String getAuthorisationDomain() {
		return this.authorisationDomain;
	}

	public String getRole() {
		return this.role;
	}

	public List<Authorisations> getAuthorisations() {
		return this.authorisations;
	}

	public String getRegistrationId() {
		return this.registrationId;
	}

	public List<String> getUniqueTechnicalIdenifier() {
		return this.uniqueTechnicalIdenifier;
	}

	public void setOrganisationId(String value) {
		this.organisationId = value;
	}

	public void setOrganisationAuthorityClaimId(String value) {
		this.organisationAuthorityClaimId = value;
	}

	public void setAuthorityId(String value) {
		this.authorityId = value;
	}

	public void setStatus(String value) {
		this.status = value;
	}

	public void setAuthorisationDomain(String value) {
		this.authorisationDomain = value;
	}

	public void setRole(String value) {
		this.role = value;
	}

	public void setAuthorisations(List<Authorisations> value) {
		this.authorisations = value;
	}

	public void setRegistrationId(String value) {
		this.registrationId = value;
	}

	public void setUniqueTechnicalIdenifier(List<String> value) {
		this.uniqueTechnicalIdenifier = value;
	}

}