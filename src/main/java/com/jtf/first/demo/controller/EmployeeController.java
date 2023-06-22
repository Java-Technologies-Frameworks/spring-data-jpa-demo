package com.jtf.first.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtf.first.demo.entity.Employee;
import com.jtf.first.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

  @Autowired
  EmployeeRepository employeeRepository;
  
  @GetMapping(path="/getemployees", produces = "application/json")
  public List<Employee> getEmployees() 
  {
      return (List<Employee>) employeeRepository.findAll();
  }
  
  @PostMapping(path= "/createemployee")
  public String addEmployee(@RequestBody Employee employee) 
  {
	  System.out.println("employee object received :: "+employee.toString());

      employeeRepository.save(employee);
       
     return "employee"+employee.getName()+" saved successfully"; 
  }

}
