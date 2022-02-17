package br.com.rest.consume.loan;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.Path;

@Path("/open-banking/products-services/v1/personal-loans")
@RegisterRestClient
public interface PersonalLoanService {

}
