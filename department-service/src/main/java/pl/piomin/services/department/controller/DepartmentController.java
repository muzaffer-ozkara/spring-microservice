package pl.piomin.services.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.piomin.services.department.client.EmployeeClient;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	EmployeeClient employeeClient;
	
	@GetMapping("/feign")
	public String getRest() {
		LOGGER.info("Department Controller getRest");
		return employeeClient.getEmployee();
	}

	@GetMapping("/test")
	public String getHelloWorld() {
		LOGGER.info("Department Controller getHelloWorld");
		return "Hello World from Department Service";
	}
	
}
