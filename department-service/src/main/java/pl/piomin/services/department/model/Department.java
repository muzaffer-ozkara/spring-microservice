package pl.piomin.services.department.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String id;
	private String organizationId;
	private String name;

	private List<Employee> employees = new ArrayList<>();

	public Department() {
		
	}

	public Department(String organizationId, String name) {
		super();
		this.organizationId = organizationId;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", organizationId=" + organizationId + ", name=" + name + "]";
	}

}
