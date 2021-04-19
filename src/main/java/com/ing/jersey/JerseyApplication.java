package com.ing.jersey;

import com.ing.jersey.domain.model.entities.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MappedTypes({User.class})
@MapperScan("com.ing.jersey.mapper")
@SpringBootApplication
public class JerseyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JerseyApplication.class, args);
	}

}
