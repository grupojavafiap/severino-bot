
package br.com.rest.consume.participants.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Participant {

    private String Status;

    private List<OrgDomainRoleClaim> OrgDomainRoleClaims = null;

    private List<AuthorisationServer> AuthorisationServers = null;

    private List<OrgDomainClaim> OrgDomainClaims = null;

    private Object Size;

    private String RegistrationId;

    private String OrganisationId;

    private String City;

    private String Postcode;

    private String AddressLine2;

    private String RegisteredName;

    private String AddressLine1;

    private String LegalEntityName;

    private String OrganisationName;

    private String Country;

    private String RegistrationNumber;
    private String CreatedOn;

    private Object Tag;

    private String ParentOrganisationReference;

    private String CompanyRegister;

    private String CountryOfRegistration;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public List<OrgDomainRoleClaim> getOrgDomainRoleClaims() {
        return OrgDomainRoleClaims;
    }

    public void setOrgDomainRoleClaims(List<OrgDomainRoleClaim> orgDomainRoleClaims) {
        this.OrgDomainRoleClaims = orgDomainRoleClaims;
    }

    public List<AuthorisationServer> getAuthorisationServers() {
        return AuthorisationServers;
    }

    public void setAuthorisationServers(List<AuthorisationServer> authorisationServers) {
        this.AuthorisationServers = authorisationServers;
    }

    public List<OrgDomainClaim> getOrgDomainClaims() {
        return OrgDomainClaims;
    }

    public void setOrgDomainClaims(List<OrgDomainClaim> orgDomainClaims) {
        this.OrgDomainClaims = orgDomainClaims;
    }

    public Object getSize() {
        return Size;
    }

    public void setSize(Object size) {
        this.Size = size;
    }

    public String getRegistrationId() {
        return RegistrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.RegistrationId = registrationId;
    }

    public String getOrganisationId() {
        return OrganisationId;
    }

    public void setOrganisationId(String organisationId) {
        this.OrganisationId = organisationId;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        this.Postcode = postcode;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.AddressLine2 = addressLine2;
    }

    public String getRegisteredName() {
        return RegisteredName;
    }

    public void setRegisteredName(String registeredName) {
        this.RegisteredName = registeredName;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.AddressLine1 = addressLine1;
    }

    public String getLegalEntityName() {
        return LegalEntityName;
    }

    public void setLegalEntityName(String legalEntityName) {
        this.LegalEntityName = legalEntityName;
    }

    public String getOrganisationName() {
        return OrganisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.OrganisationName = organisationName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.RegistrationNumber = registrationNumber;
    }

    public String getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(String createdOn) {
        this.CreatedOn = createdOn;
    }

    public Object getTag() {
        return Tag;
    }

    public void setTag(Object tag) {
        this.Tag = tag;
    }

    public String getParentOrganisationReference() {
        return ParentOrganisationReference;
    }

    public void setParentOrganisationReference(String parentOrganisationReference) {
        this.ParentOrganisationReference = parentOrganisationReference;
    }

    public String getCompanyRegister() {
        return CompanyRegister;
    }

    public void setCompanyRegister(String companyRegister) {
        this.CompanyRegister = companyRegister;
    }

    public String getCountryOfRegistration() {
        return CountryOfRegistration;
    }

    public void setCountryOfRegistration(String countryOfRegistration) {
        this.CountryOfRegistration = countryOfRegistration;
    }

}
