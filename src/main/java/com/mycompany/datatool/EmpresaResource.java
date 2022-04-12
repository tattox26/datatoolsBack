package com.mycompany.datatool;
    
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

@Path("Empresa")
public class EmpresaResource {

    @Context
    private UriInfo context;
    public EmpresaResource() {
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "Hola";
        //throw new UnsupportedOperationException();
    }

}
