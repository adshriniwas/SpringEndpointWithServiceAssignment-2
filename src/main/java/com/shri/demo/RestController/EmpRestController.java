package com.shri.demo.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shri.demo.Model.Employee;
import com.shri.demo.Service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpRestController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping("msg")
	public String msgByShri() {
		return empService.shrimsg();
	}
	
	@RequestMapping("data")
	public Employee getEmpData() {
		return empService.empData();
	}
	
	@RequestMapping("empName")
	public String getEmpNameData() {
		return empService.empName();
	}
	@RequestMapping("empAddress")
	public String getEmpAddressData() {
		return empService.empAddress();
	}
	@RequestMapping("empId")
	public String getEmpIdData() {
		return empService.empId();
	}
}
