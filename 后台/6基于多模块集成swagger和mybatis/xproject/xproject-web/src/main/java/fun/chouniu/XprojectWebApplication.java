package fun.chouniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("fun.chouniu.xprojectdao")
public class XprojectWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(XprojectWebApplication.class, args);
    }

}
