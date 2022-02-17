package br.com.rest.consume.participants.dto;

public class Contacts {
	private String contactId;
	private String organisationId;
	private String contactType;
	private String firstName;
	private String lastName;
	private String department;
	private String emailAddress;
	private String phoneNumber;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String postcode;
	private String country;
	private String additionalInformation;
	private String pgpPublicKey;

	public Contacts() {

	}

	public String getContactId() {
		return this.contactId;
	}

	public String getOrganisationId() {
		return this.organisationId;
	}

	public String getContactType() {
		return this.contactType;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getDepartment() {
		return this.department;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public String getCity() {
		return this.city;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public String getCountry() {
		return this.country;
	}

	public String getAdditionalInformation() {
		return this.additionalInformation;
	}

	public String getPgpPublicKey() {
		return this.pgpPublicKey;
	}

	public void setContactId(String value) {
		this.contactId = value;
	}

	public void setOrganisationId(String value) {
		this.organisationId = value;
	}

	public void setContactType(String value) {
		this.contactType = value;
	}

	public void setFirstName(String value) {
		this.firstName = value;
	}

	public void setLastName(String value) {
		this.lastName = value;
	}

	public void setDepartment(String value) {
		this.department = value;
	}

	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}

	public void setAddressLine1(String value) {
		this.addressLine1 = value;
	}

	public void setAddressLine2(String value) {
		this.addressLine2 = value;
	}

	public void setCity(String value) {
		this.city = value;
	}

	public void setPostcode(String value) {
		this.postcode = value;
	}

	public void setCountry(String value) {
		this.country = value;
	}

	public void setAdditionalInformation(String value) {
		this.additionalInformation = value;
	}

	public void setPgpPublicKey(String value) {
		this.pgpPublicKey = value;
	}

}