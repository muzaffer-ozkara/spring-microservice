package pl.piomin.services.organization.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pl.piomin.services.organization.client.DepartmentClient;
import pl.piomin.services.organization.client.EmployeeClient;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationController.class);

	@Autowired
	DepartmentClient departmentClient;
	@Autowired
	EmployeeClient employeeClient;

	@GetMapping("/feign/employee")
	public String getEmployee() {
		LOGGER.info("Department Controller getEmployee");
		return employeeClient.getEmployee();
	}

	@GetMapping("/feign/department")
	public String getDepartment() {
		LOGGER.info("Department Controller getDepartment");
		return departmentClient.getDepartment();
	}
	
}
