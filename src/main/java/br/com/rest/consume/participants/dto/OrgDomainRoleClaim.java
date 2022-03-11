
package br.com.rest.consume.participants.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class OrgDomainRoleClaim {

    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("AuthorisationDomain")
    @Expose
    private String authorisationDomain;
    @SerializedName("Role")
    @Expose
    private String role;
    @SerializedName("RegistrationId")
    @Expose
    private String registrationId;
    @SerializedName("Authorisations")
    @Expose
    private List<Object> authorisations = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthorisationDomain() {
        return authorisationDomain;
    }

    public void setAuthorisationDomain(String authorisationDomain) {
        this.authorisationDomain = authorisationDomain;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public List<Object> getAuthorisations() {
        return authorisations;
    }

    public void setAuthorisations(List<Object> authorisations) {
        this.authorisations = authorisations;
    }

}
