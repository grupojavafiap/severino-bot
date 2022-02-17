package br.com.rest.consume.participants.dto;

import java.util.List;

public class AuthorisationServers {
	private String authorisationServerId;
	private String organisationId;
	private boolean autoRegistrationSupported;
	private List<ApiResources> apiResources;
	private String customerFriendlyDescription;
	private String customerFriendlyLogoUri;
	private String customerFriendlyName;
	private String developerPortalUri;
	private String termsOfServiceUri;
	private String notificationWebhook;
	private String notificationWebhookStatus;
	private String openIdDiscoveryDocument;
	private String payloadSigningCertLocationUri;
	private String parentAuthorisationServerId;

	public AuthorisationServers() {

	}

	public String getAuthorisationServerId() {
		return this.authorisationServerId;
	}

	public String getOrganisationId() {
		return this.organisationId;
	}

	public boolean getAutoRegistrationSupported() {
		return this.autoRegistrationSupported;
	}

	public List<ApiResources> getApiResources() {
		return this.apiResources;
	}

	public String getCustomerFriendlyDescription() {
		return this.customerFriendlyDescription;
	}

	public String getCustomerFriendlyLogoUri() {
		return this.customerFriendlyLogoUri;
	}

	public String getCustomerFriendlyName() {
		return this.customerFriendlyName;
	}

	public String getDeveloperPortalUri() {
		return this.developerPortalUri;
	}

	public String getTermsOfServiceUri() {
		return this.termsOfServiceUri;
	}

	public String getNotificationWebhook() {
		return this.notificationWebhook;
	}

	public String getNotificationWebhookStatus() {
		return this.notificationWebhookStatus;
	}

	public String getOpenIdDiscoveryDocument() {
		return this.openIdDiscoveryDocument;
	}

	public String getPayloadSigningCertLocationUri() {
		return this.payloadSigningCertLocationUri;
	}

	public String getParentAuthorisationServerId() {
		return this.parentAuthorisationServerId;
	}

	public void setAuthorisationServerId(String value) {
		this.authorisationServerId = value;
	}

	public void setOrganisationId(String value) {
		this.organisationId = value;
	}

	public void setAutoRegistrationSupported(boolean value) {
		this.autoRegistrationSupported = value;
	}

	public void setApiResources(List<ApiResources> value) {
		this.apiResources = value;
	}

	public void setCustomerFriendlyDescription(String value) {
		this.customerFriendlyDescription = value;
	}

	public void setCustomerFriendlyLogoUri(String value) {
		this.customerFriendlyLogoUri = value;
	}

	public void setCustomerFriendlyName(String value) {
		this.customerFriendlyName = value;
	}

	public void setDeveloperPortalUri(String value) {
		this.developerPortalUri = value;
	}

	public void setTermsOfServiceUri(String value) {
		this.termsOfServiceUri = value;
	}

	public void setNotificationWebhook(String value) {
		this.notificationWebhook = value;
	}

	public void setNotificationWebhookStatus(String value) {
		this.notificationWebhookStatus = value;
	}

	public void setOpenIdDiscoveryDocument(String value) {
		this.openIdDiscoveryDocument = value;
	}

	public void setPayloadSigningCertLocationUri(String value) {
		this.payloadSigningCertLocationUri = value;
	}

	public void setParentAuthorisationServerId(String value) {
		this.parentAuthorisationServerId = value;
	}

}