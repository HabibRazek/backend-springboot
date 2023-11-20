package com.walter.drugs.service;

import com.walter.drugs.entities.Drugs;

import java.util.List;

public interface DrugsService {
    Drugs saveDrugs(Drugs drug);
    Drugs updateDrugs(Drugs drug);
    void deleteDrugs(Drugs drug);
    void deleteDrugsById(Long id);
    Drugs getDrugsById(Long id);
    Iterable<Drugs> getAllDrugs();

    /****/
    List<Drugs> findByGenericName(String genericName);
    List<Drugs> findByGenericNameContains(String genericName);
    List<Drugs> findByDrugClassIdcl(Integer idcl);
    List<Drugs> findByOrderByGenericNameAsc();
    List<Drugs> sortByGenericNameDosageForm();
    List<Drugs> findByGenericNameBrandNames(String genericName, String brandNames);







}
