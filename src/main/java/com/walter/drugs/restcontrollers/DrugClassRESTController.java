package com.walter.drugs.restcontrollers;


import com.walter.drugs.entities.DrugClass;
import com.walter.drugs.repos.DrugClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dclass")
@CrossOrigin("*")
public class DrugClassRESTController {


    @Autowired
    DrugClassRepository drugClassRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<DrugClass> getAllDrugClasses() {
        return drugClassRepository.findAll();
    }

    @RequestMapping(value="/{idcl}",method = RequestMethod.GET)
    public DrugClass getDrugClassById(@PathVariable("idcl") int idcl) {
        return drugClassRepository.findByIdcl(idcl);
    }

/*
    @RequestMapping(method = RequestMethod.POST)
    public DrugClass saveDrugClass(@RequestBody DrugClass drugClass) {
        return drugClassRepository.save(drugClass);
    }
*/

    @RequestMapping(method = RequestMethod.POST)
    public DrugClass saveDrugClass(@RequestBody DrugClass drugClass) {
        return drugClassRepository.save(drugClass);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public DrugClass updateDrugs(@RequestBody DrugClass drugClass) {
        return drugClassRepository.save(drugClass);
    }





}
