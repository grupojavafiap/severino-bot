package br.com.rest.consume.participants.dto;

import java.util.List;

public class Participant {
	private String OrganisationId;
	private String Status;
	private String OrganisationName;
	private String CreatedOn;
	private String LegalEntityName;
	private String CountryOfRegistration;
	private String CompanyRegister;
	private String RegistrationNumber;
	private String RegistrationId;
	private String RegisteredName;
	private String AddressLine1;
	private String AddressLine2;
	private String City;
	private String Postcode;
	private String Country;
	private String ParentOrganisationReference;
	private List<Contacts> contacts;
	private List<AuthorisationServers> AuthorisationServers;
	private List<OrgDomainClaims> OrgDomainClaims;
	private List<OrgDomainRoleClaims> OrgDomainRoleClaims;

	public Participant() {

	}

	public String getOrganisationId() {
		return this.OrganisationId;
	}

	public String getStatus() {
		return this.Status;
	}

	public String getOrganisationName() {
		return this.OrganisationName;
	}

	public String getCreatedOn() {
		return this.CreatedOn;
	}

	public String getLegalEntityName() {
		return this.LegalEntityName;
	}

	public String getCountryOfRegistration() {
		return this.CountryOfRegistration;
	}

	public String getCompanyRegister() {
		return this.CompanyRegister;
	}

	public String getRegistrationNumber() {
		return this.RegistrationNumber;
	}

	public String getRegistrationId() {
		return this.RegistrationId;
	}

	public String getRegisteredName() {
		return this.RegisteredName;
	}

	public String getAddressLine1() {
		return this.AddressLine1;
	}

	public String getAddressLine2() {
		return this.AddressLine2;
	}

	public String getCity() {
		return this.City;
	}

	public String getPostcode() {
		return this.Postcode;
	}

	public String getCountry() {
		return this.Country;
	}

	public String getParentOrganisationReference() {
		return this.ParentOrganisationReference;
	}

	public List<Contacts> getContacts() {
		return this.contacts;
	}

	public List<AuthorisationServers> getAuthorisationServers() {
		return this.AuthorisationServers;
	}

	public List<OrgDomainClaims> getOrgDomainClaims() {
		return this.OrgDomainClaims;
	}

	public List<OrgDomainRoleClaims> getOrgDomainRoleClaims() {
		return this.OrgDomainRoleClaims;
	}

	public void setOrganisationId(String value) {
		this.OrganisationId = value;
	}

	public void setStatus(String value) {
		this.Status = value;
	}

	public void setOrganisationName(String value) {
		this.OrganisationName = value;
	}

	public void setCreatedOn(String value) {
		this.CreatedOn = value;
	}

	public void setLegalEntityName(String value) {
		this.LegalEntityName = value;
	}

	public void setCountryOfRegistration(String value) {
		this.CountryOfRegistration = value;
	}

	public void setCompanyRegister(String value) {
		this.CompanyRegister = value;
	}

	public void setRegistrationNumber(String value) {
		this.RegistrationNumber = value;
	}

	public void setRegistrationId(String value) {
		this.RegistrationId = value;
	}

	public void setRegisteredName(String value) {
		this.RegisteredName = value;
	}

	public void setAddressLine1(String value) {
		this.AddressLine1 = value;
	}

	public void setAddressLine2(String value) {
		this.AddressLine2 = value;
	}

	public void setCity(String value) {
		this.City = value;
	}

	public void setPostcode(String value) {
		this.Postcode = value;
	}

	public void setCountry(String value) {
		this.Country = value;
	}

	public void setParentOrganisationReference(String value) {
		this.ParentOrganisationReference = value;
	}

	public void setContacts(List<Contacts> value) {
		this.contacts = value;
	}

	public void setAuthorisationServers(List<AuthorisationServers> value) {
		this.AuthorisationServers = value;
	}

	public void setOrgDomainClaims(List<OrgDomainClaims> value) {
		this.OrgDomainClaims = value;
	}

	public void setOrgDomainRoleClaims(List<OrgDomainRoleClaims> value) {
		this.OrgDomainRoleClaims = value;
	}

}