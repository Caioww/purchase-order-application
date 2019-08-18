package com.purchaseorder.purchaseorderapplication.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.purchaseorder.purchaseorderapplication.document.Users;
import com.purchaseorder.purchaseorderapplication.repository.UsersRepository;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UsersRepository user) {
		return string -> user.save(new Users("1", "admin", "caioww.99@hotmail.com", "admin123"));
	}

}
