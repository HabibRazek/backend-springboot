package com.walter.drugs.repos;
import com.walter.drugs.entities.DrugClass;
import com.walter.drugs.entities.Drugs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface DrugsRepository extends JpaRepository<Drugs, Long> {

    List<Drugs> findByGenericName(String genericName);
    List<Drugs> findByGenericNameContains(String genericName);
   /* @Query ("select d from Drugs d where d.genericName like %?1 and d.brandNames like %?2")
    List<Drugs> findByGenericNameBrandNames(String genericName, String brandNames);*/

    //query with param
    @Query ("select d from Drugs d where d.genericName like %:genericName and d.brandNames like %:brandNames")
    List<Drugs> findByGenericNameBrandNames(@Param("genericName") String genericName, @Param("brandNames") String brandNames);

    @Query ("select d from Drugs d where d.drugClass =?1")
    List<Drugs> findByDrugClass(DrugClass drugClass);

    List<Drugs> findByDrugClassIdcl(Integer idcl);

    List<Drugs> findByOrderByGenericNameAsc();

    @Query ("select d from Drugs d order by d.genericName asc , d.dosageForm desc")
    List<Drugs> sortByGenericNameDosageForm();



}
