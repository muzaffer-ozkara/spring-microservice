package pl.piomin.services.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);


	@GetMapping("/test")
	public String getEmployee() {
		LOGGER.info("Employee : {}", "Hello World");
		return "Hello World from Employee Service";
	}
	
}
