package pl.piomin.services.organization.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "employee", url = "${microservices.employee.url}")
public interface EmployeeClient {

	@GetMapping("/employee/test")
	String getEmployee();

}
