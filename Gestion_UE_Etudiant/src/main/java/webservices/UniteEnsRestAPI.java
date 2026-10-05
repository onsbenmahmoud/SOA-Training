package webservices;

import metiers.UniteEnseignementBusiness;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/ue")
public class UniteEnsRestAPI {

    UniteEnseignementBusiness helper =
            new UniteEnseignementBusiness();
    @GET
    @Path("/List")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getListeUEs() {

        return Response
                .status(200)
                .entity(helper.getListeUE())
                .build();
    }
}