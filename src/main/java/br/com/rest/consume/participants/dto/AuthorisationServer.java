
package br.com.rest.consume.participants.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AuthorisationServer {

    @SerializedName("PayloadSigningCertLocationUri")
    @Expose
    private String payloadSigningCertLocationUri;
    @SerializedName("ParentAuthorisationServerId")
    @Expose
    private Object parentAuthorisationServerId;
    @SerializedName("OpenIDDiscoveryDocument")
    @Expose
    private String openIDDiscoveryDocument;
    @SerializedName("CustomerFriendlyName")
    @Expose
    private String customerFriendlyName;
    @SerializedName("CustomerFriendlyDescription")
    @Expose
    private String customerFriendlyDescription;
    @SerializedName("TermsOfServiceUri")
    @Expose
    private String termsOfServiceUri;
    @SerializedName("ApiResources")
    @Expose
    private List<ApiResource> apiResources = null;
    @SerializedName("AutoRegistrationSupported")
    @Expose
    private Boolean autoRegistrationSupported;
    @SerializedName("CustomerFriendlyLogoUri")
    @Expose
    private String customerFriendlyLogoUri;
    @SerializedName("SupportsDCR")
    @Expose
    private Boolean supportsDCR;
    @SerializedName("AuthorisationServerCertifications")
    @Expose
    private List<Object> authorisationServerCertifications = null;
    @SerializedName("SupportsCiba")
    @Expose
    private Boolean supportsCiba;
    @SerializedName("DeveloperPortalUri")
    @Expose
    private String developerPortalUri;
    @SerializedName("NotificationWebhookAddedDate")
    @Expose
    private Object notificationWebhookAddedDate;
    @SerializedName("AuthorisationServerId")
    @Expose
    private String authorisationServerId;

    public String getPayloadSigningCertLocationUri() {
        return payloadSigningCertLocationUri;
    }

    public void setPayloadSigningCertLocationUri(String payloadSigningCertLocationUri) {
        this.payloadSigningCertLocationUri = payloadSigningCertLocationUri;
    }

    public Object getParentAuthorisationServerId() {
        return parentAuthorisationServerId;
    }

    public void setParentAuthorisationServerId(Object parentAuthorisationServerId) {
        this.parentAuthorisationServerId = parentAuthorisationServerId;
    }

    public String getOpenIDDiscoveryDocument() {
        return openIDDiscoveryDocument;
    }

    public void setOpenIDDiscoveryDocument(String openIDDiscoveryDocument) {
        this.openIDDiscoveryDocument = openIDDiscoveryDocument;
    }

    public String getCustomerFriendlyName() {
        return customerFriendlyName;
    }

    public void setCustomerFriendlyName(String customerFriendlyName) {
        this.customerFriendlyName = customerFriendlyName;
    }

    public String getCustomerFriendlyDescription() {
        return customerFriendlyDescription;
    }

    public void setCustomerFriendlyDescription(String customerFriendlyDescription) {
        this.customerFriendlyDescription = customerFriendlyDescription;
    }

    public String getTermsOfServiceUri() {
        return termsOfServiceUri;
    }

    public void setTermsOfServiceUri(String termsOfServiceUri) {
        this.termsOfServiceUri = termsOfServiceUri;
    }

    public List<ApiResource> getApiResources() {
        return apiResources;
    }

    public void setApiResources(List<ApiResource> apiResources) {
        this.apiResources = apiResources;
    }

    public Boolean getAutoRegistrationSupported() {
        return autoRegistrationSupported;
    }

    public void setAutoRegistrationSupported(Boolean autoRegistrationSupported) {
        this.autoRegistrationSupported = autoRegistrationSupported;
    }

    public String getCustomerFriendlyLogoUri() {
        return customerFriendlyLogoUri;
    }

    public void setCustomerFriendlyLogoUri(String customerFriendlyLogoUri) {
        this.customerFriendlyLogoUri = customerFriendlyLogoUri;
    }

    public Boolean getSupportsDCR() {
        return supportsDCR;
    }

    public void setSupportsDCR(Boolean supportsDCR) {
        this.supportsDCR = supportsDCR;
    }

    public List<Object> getAuthorisationServerCertifications() {
        return authorisationServerCertifications;
    }

    public void setAuthorisationServerCertifications(List<Object> authorisationServerCertifications) {
        this.authorisationServerCertifications = authorisationServerCertifications;
    }

    public Boolean getSupportsCiba() {
        return supportsCiba;
    }

    public void setSupportsCiba(Boolean supportsCiba) {
        this.supportsCiba = supportsCiba;
    }

    public String getDeveloperPortalUri() {
        return developerPortalUri;
    }

    public void setDeveloperPortalUri(String developerPortalUri) {
        this.developerPortalUri = developerPortalUri;
    }

    public Object getNotificationWebhookAddedDate() {
        return notificationWebhookAddedDate;
    }

    public void setNotificationWebhookAddedDate(Object notificationWebhookAddedDate) {
        this.notificationWebhookAddedDate = notificationWebhookAddedDate;
    }

    public String getAuthorisationServerId() {
        return authorisationServerId;
    }

    public void setAuthorisationServerId(String authorisationServerId) {
        this.authorisationServerId = authorisationServerId;
    }

}
