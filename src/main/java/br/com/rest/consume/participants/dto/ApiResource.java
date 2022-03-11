
package br.com.rest.consume.participants.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ApiResource {

    @SerializedName("ApiFamilyType")
    @Expose
    private String apiFamilyType;
    @SerializedName("ApiVersion")
    @Expose
    private Integer apiVersion;
    @SerializedName("FamilyComplete")
    @Expose
    private Boolean familyComplete;
    @SerializedName("CertificationExpirationDate")
    @Expose
    private Object certificationExpirationDate;
    @SerializedName("ApiResourceId")
    @Expose
    private String apiResourceId;
    @SerializedName("CertificationStartDate")
    @Expose
    private Object certificationStartDate;
    @SerializedName("ApiCertificationUri")
    @Expose
    private Object apiCertificationUri;
    @SerializedName("ApiDiscoveryEndpoints")
    @Expose
    private List<ApiDiscoveryEndpoint> apiDiscoveryEndpoints = null;
    @SerializedName("CertificationStatus")
    @Expose
    private Object certificationStatus;

    public String getApiFamilyType() {
        return apiFamilyType;
    }

    public void setApiFamilyType(String apiFamilyType) {
        this.apiFamilyType = apiFamilyType;
    }

    public Integer getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Integer apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Boolean getFamilyComplete() {
        return familyComplete;
    }

    public void setFamilyComplete(Boolean familyComplete) {
        this.familyComplete = familyComplete;
    }

    public Object getCertificationExpirationDate() {
        return certificationExpirationDate;
    }

    public void setCertificationExpirationDate(Object certificationExpirationDate) {
        this.certificationExpirationDate = certificationExpirationDate;
    }

    public String getApiResourceId() {
        return apiResourceId;
    }

    public void setApiResourceId(String apiResourceId) {
        this.apiResourceId = apiResourceId;
    }

    public Object getCertificationStartDate() {
        return certificationStartDate;
    }

    public void setCertificationStartDate(Object certificationStartDate) {
        this.certificationStartDate = certificationStartDate;
    }

    public Object getApiCertificationUri() {
        return apiCertificationUri;
    }

    public void setApiCertificationUri(Object apiCertificationUri) {
        this.apiCertificationUri = apiCertificationUri;
    }

    public List<ApiDiscoveryEndpoint> getApiDiscoveryEndpoints() {
        return apiDiscoveryEndpoints;
    }

    public void setApiDiscoveryEndpoints(List<ApiDiscoveryEndpoint> apiDiscoveryEndpoints) {
        this.apiDiscoveryEndpoints = apiDiscoveryEndpoints;
    }

    public Object getCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(Object certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

}
