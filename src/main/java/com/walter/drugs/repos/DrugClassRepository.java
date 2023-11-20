package com.walter.drugs.repos;

import com.walter.drugs.entities.DrugClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "drugClass")
@CrossOrigin("http://localhost:4200/")
public interface DrugClassRepository extends JpaRepository<DrugClass, Integer> {

    DrugClass findByIdcl(int idcl);


}


