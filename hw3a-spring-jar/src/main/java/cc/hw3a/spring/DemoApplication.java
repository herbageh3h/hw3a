package cc.hw3a.spring;

import org.apache.ibatis.type.MappedTypes;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;

import cc.hw3a.spring.fruit.Fruit;

@MappedTypes(Fruit.class)
@MapperScan("cc.hw3a.springjar")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
