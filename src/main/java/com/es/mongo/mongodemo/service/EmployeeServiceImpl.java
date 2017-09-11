package com.es.mongo.mongodemo.service;

import com.es.mongo.mongodemo.domain.Employee;
import com.es.mongo.mongodemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;


    public Employee findById(int id) {
        return this.repository.findById(id);
    }


    public List<Employee> findAll() {
        return this.repository.findAll();
    }

    public List<Employee> findByGroupId(int groupId) {
        return this.repository.findByGroupId(groupId);
    }

    public List<Employee> findByDataGroupId(int dataGroupId) {
        return this.repository.findByDataGroupId(dataGroupId);
    }

}
