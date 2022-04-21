package pl.piomin.services.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;
import java.util.Map;

@SpringBootApplication
@EnableSwagger2
public class EmployeeApplication {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@PostConstruct
	public void envs() {
		Map<String, String> env = System.getenv();
		for (String envName : env.keySet()) {
			LOG.info("{}={}", envName, env.get(envName));
		}
	}

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage("pl.piomin.services.employee.controller"))
					.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Employee API").description("Documentation Employee API v" + "1.0").build());
	}

	@Bean
	UiConfiguration uiConfig() {
		return new UiConfiguration(Boolean.TRUE, Boolean.FALSE, 1, 1, ModelRendering.MODEL, Boolean.FALSE, DocExpansion.LIST, Boolean.FALSE, null, OperationsSorter.ALPHA, Boolean.FALSE, TagsSorter.ALPHA, UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, null);
	}

}
