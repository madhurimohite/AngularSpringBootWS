package com.example.Angular.AngularSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularSpringBootApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User(11l, "mm", "mohite"));
		userRepository.save(new User(12l, "ms", "mohite"));
		userRepository.save(new User(13l, "madhu", "mohite"));
		
	}
}
