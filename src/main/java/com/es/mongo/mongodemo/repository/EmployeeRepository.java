package com.es.mongo.mongodemo.repository;


import com.es.mongo.mongodemo.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

     Employee findById(int id);
     List<Employee> findByGroupId(int groupId);
     List<Employee> findByDataGroupId(int dataGroupId);
}
