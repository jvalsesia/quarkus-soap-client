package com.avaya.poc;

import io.quarkiverse.cxf.annotation.CXFClient;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
@Path("/cxf/hello-client")
public class CxfClientRestResource {
    
    @CXFClient("helloService") 
    HelloService helloService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name) {
        return helloService.hello(name);
    }
}
