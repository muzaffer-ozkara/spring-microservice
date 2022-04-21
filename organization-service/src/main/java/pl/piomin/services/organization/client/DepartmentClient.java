package pl.piomin.services.organization.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "department", url = "${microservices.department.url}")
public interface DepartmentClient {

	@GetMapping("/department/test")
	String getDepartment();

}
