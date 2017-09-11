package com.es.mongo.mongodemo.service;


import com.es.mongo.mongodemo.domain.Employee;

import java.util.List;

public interface EmployeeService {

     List<Employee> findAll();
     Employee findById(int Id);
     List<Employee> findByGroupId(int groupId);
     List<Employee> findByDataGroupId(int groupId);
}
