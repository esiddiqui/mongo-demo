package com.es.mongo.mongodemo;

import com.es.mongo.mongodemo.domain.Employee;
import com.es.mongo.mongodemo.repository.EmployeeRepository;
import com.es.mongo.mongodemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MongoDemoApplication implements CommandLineRunner {


	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception  {
		System.out.println("Running MongoDB operations");

        //Employee employee = new Employee(200,"test", "Test User", 1,12);
		//this.repository.save(employee);

		this.employeeService.findByDataGroupId(12).stream().forEach(c -> System.out.println( c.toString()));
	}
}
