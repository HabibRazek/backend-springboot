package com.walter.drugs;

import com.walter.drugs.entities.DrugClass;
import com.walter.drugs.entities.Drugs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class DrugsApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(DrugsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Drugs.class, DrugClass.class);
	}
}
