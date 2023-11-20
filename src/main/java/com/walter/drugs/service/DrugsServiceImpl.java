package com.walter.drugs.service;

import com.walter.drugs.entities.Drugs;
import com.walter.drugs.repos.DrugsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DrugsServiceImpl implements DrugsService {
    @Autowired
    DrugsRepository drugsRepository;

    @Override
    public Drugs saveDrugs(Drugs drug) {
        return drugsRepository.save(drug);
    }

    @Override
    public Drugs updateDrugs(Drugs drug) {
        return drugsRepository.save(drug);
    }

    @Override
    public void deleteDrugs(Drugs drug) {
        drugsRepository.delete(drug);
    }

    @Override
    public void deleteDrugsById(Long id) {
        drugsRepository.deleteById(id);
    }

    @Override
    public Drugs getDrugsById(Long id) {
        return drugsRepository.findById(id).get();

    }




    @Override
    public Iterable<Drugs> getAllDrugs() {
        return drugsRepository.findAll();
    }

    @Override
    public List<Drugs> findByGenericName(String genericName) {
        return drugsRepository.findByGenericName(genericName);
    }

    @Override
    public List<Drugs> findByGenericNameContains(String genericName) {
        return drugsRepository.findByGenericNameContains(genericName);
    }

    @Override
    public List<Drugs> findByDrugClassIdcl(Integer idcl) {
        return drugsRepository.findByDrugClassIdcl(idcl);
    }

    @Override
    public List<Drugs> findByOrderByGenericNameAsc() {
        return drugsRepository.findByOrderByGenericNameAsc();
    }

    @Override
    public List<Drugs> sortByGenericNameDosageForm() {
        return drugsRepository.sortByGenericNameDosageForm();
    }

    @Override
    public List<Drugs> findByGenericNameBrandNames(String genericName, String brandNames) {
        return drugsRepository.findByGenericNameBrandNames(genericName, brandNames);
    }
}

