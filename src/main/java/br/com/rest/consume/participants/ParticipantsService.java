package br.com.rest.consume.participants;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import br.com.rest.consume.participants.dto.Participant;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import java.util.List;

@Path("/participants")
@RegisterRestClient(configKey = "participants")
public interface ParticipantsService {

    /**
     * Consulta a lista de participantes no diretório do open banking.
     * 
     */
    @GET
    List<Participant> getParticipants();
}
