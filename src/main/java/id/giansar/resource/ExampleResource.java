package id.giansar.resource;

import id.giansar.service.ExampleService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    ExampleService exampleService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return exampleService.sayHello();
    }
}
