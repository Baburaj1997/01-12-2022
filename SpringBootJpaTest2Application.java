package com.spring.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.spring.data.jpa.demo.controller.ActorGenreMovieController;

@SpringBootApplication
public class SpringBootJpaTest2Application implements CommandLineRunner {
	
	@Autowired
     private ActorGenreMovieController actorgenremovieController;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaTest2Application.class, args);
	}
		@Override
		public void run(String... args) throws Exception {
			actorgenremovieController.run();
			
	}

}
