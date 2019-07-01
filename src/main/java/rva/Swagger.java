package rva;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swagger {
	@Bean
	public Docket productApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("rva"))
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		return new ApiInfo("Backend RVA Swagger", 
				"Razvoj višeslojnih aplikacija", 
				"1.0", 
				"", 
				new Contact("Sandra Djuricin", "https://github.com/rva2019/IT45-2016-Djuricin-Sandra", "konosubasaki@gmail.com"), 
				"", 
				"");
	}
}
