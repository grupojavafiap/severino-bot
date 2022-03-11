
package br.com.rest.consume.participants.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class OrgDomainClaim {

    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("AuthorityName")
    @Expose
    private String authorityName;
    @SerializedName("RegistrationId")
    @Expose
    private String registrationId;
    @SerializedName("AuthorisationDomainName")
    @Expose
    private String authorisationDomainName;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getAuthorisationDomainName() {
        return authorisationDomainName;
    }

    public void setAuthorisationDomainName(String authorisationDomainName) {
        this.authorisationDomainName = authorisationDomainName;
    }

}
