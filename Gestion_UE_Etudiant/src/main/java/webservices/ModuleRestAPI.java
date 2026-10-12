package webservices;
import entities.Module;
import entities.UniteEnseignement;
import metiers.ModuleBusiness;
import metiers.UniteEnseignementBusiness;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/modules")
public class ModuleRestAPI {
    static ModuleBusiness helper = new ModuleBusiness();
    @Path("/List")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllModules() {
        return Response.ok(helper.getAllModules()).build();
    }
}
