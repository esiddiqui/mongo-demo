package com.es.mongo.mongodemo.api;


import com.es.mongo.mongodemo.domain.Employee;
import com.es.mongo.mongodemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
@Path("/v1/employees/")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @Autowired
    EmployeeRepository repository;

    @GET
    public Response get() {
        List<Employee> emp = this.repository.findAll();
        return Response.status(200).entity(emp).build();
    }

}
