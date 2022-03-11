
package br.com.rest.consume.participants.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ApiDiscoveryEndpoint {

    @SerializedName("ApiDiscoveryId")
    @Expose
    private String apiDiscoveryId;
    @SerializedName("ApiEndpoint")
    @Expose
    private String apiEndpoint;

    public String getApiDiscoveryId() {
        return apiDiscoveryId;
    }

    public void setApiDiscoveryId(String apiDiscoveryId) {
        this.apiDiscoveryId = apiDiscoveryId;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

}
