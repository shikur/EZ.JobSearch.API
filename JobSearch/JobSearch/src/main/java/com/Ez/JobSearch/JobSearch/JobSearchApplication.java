package com.Ez.JobSearch.JobSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories("com.Ez.JobSearch.JobSearch.Repositories")
@ComponentScan("com.Ez.JobSearch.*")
public class JobSearchApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(JobSearchApplication.class, args);
	}

}
