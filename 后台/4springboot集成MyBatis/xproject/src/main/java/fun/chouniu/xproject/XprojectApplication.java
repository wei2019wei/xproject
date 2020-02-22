package fun.chouniu.xproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fun.chouniu.xproject.dao")
public class XprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(XprojectApplication.class, args);
    }

}
