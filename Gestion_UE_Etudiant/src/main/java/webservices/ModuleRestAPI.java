package webservices;

import entities.Module;
import metiers.ModuleBusiness;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/modules")
public class ModuleRestAPI {

    static ModuleBusiness helper = new ModuleBusiness();

    // GET /modules/List : tous les modules
    @Path("/List")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllModules() {
        return Response.ok(helper.getAllModules()).build();
    }

    // GET /modules/{matricule} : un module par matricule
    @Path("/{matricule}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getModule(@PathParam("matricule") String matricule) {
        Module m = helper.getModuleByMatricule(matricule);
        if (m == null) {
            return Response.status(404).build();
        }
        return Response.ok(m).build();
    }
}