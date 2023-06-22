package com.jtf.first.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jtf.first.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>  {
   public List<Employee> findByName(String name);	
   public List<Employee> findByAge(int age);
   public Employee findByEmail(String email);
}
