package com.tj.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tj.springboot.mapper")
@SpringBootApplication
public class SpringbootWebRestfulcurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebRestfulcurdApplication.class, args);
	}

}
