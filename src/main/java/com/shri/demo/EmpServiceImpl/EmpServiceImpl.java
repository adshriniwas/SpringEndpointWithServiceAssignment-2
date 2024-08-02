package com.shri.demo.EmpServiceImpl;

import org.springframework.stereotype.Service;

import com.shri.demo.Model.Employee;
import com.shri.demo.Service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Override
	public String shrimsg() {
		// TODO Auto-generated method stub
		String str = "Welcome to our website this is the introduction msg";
		return str;
	}

	@Override
	public Employee empData() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmpName("shriniwas pawar");
		emp.setId(101);
		emp.setAddress("Nanded");
		return emp;
	}

	@Override
	public String empName() {
		// TODO Auto-generated method stub
		String str = "Employee Name = "+empData().getEmpName();
		return str;
	}

	@Override
	public String empId() {
		// TODO Auto-generated method stub
		String str = "Employee Id = "+empData().getId();
		return str;
	}

	@Override
	public String empAddress() {
		// TODO Auto-generated method stub
		String str = "Employee Address = "+empData().getAddress();
		return str;
	}

	
}
