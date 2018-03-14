package com.raji.tasks;

import domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.TaskService;

import java.time.LocalDate;
@EnableJpaRepositories
@SpringBootApplication
@EntityScan("domain")
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}





     /*@Bean
    CommandLineRunner runner(TaskService taskService){
	    return  args -> {
	       taskService.save(new Task());
        };
    }*/
}
