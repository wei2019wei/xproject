package fun.chouniu.xprojectweb.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chouniu
 * @version 1.0
 * @date 2020/3/13 18:55
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("xproject")
                .description("xproject 文档")
                .version("1.0.0")
                .build();
    }

    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
    }
}
