package com.shri.demo.Service;

import org.springframework.stereotype.Service;

import com.shri.demo.Model.Employee;

@Service
public interface EmpService {

	String shrimsg();

	Employee empData();

	String empName();

	String empId();

	String empAddress();

}
