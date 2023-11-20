package com.walter.drugs.restcontrollers;

import com.walter.drugs.entities.Drugs;
import com.walter.drugs.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class DrugRESTController {

    @Autowired
    DrugsService drugsService;

    @RequestMapping(path="all",method =RequestMethod.GET)
    public Iterable<Drugs> getAllDrugs() {
        return drugsService.getAllDrugs();
    }

    @RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
    public Drugs getDrugsById(@PathVariable("id") Long id) {
        return drugsService.getDrugsById(id);
    }


    @RequestMapping(path="/adddrug",method = RequestMethod.POST)
    public Drugs saveDrugs(@RequestBody Drugs drug) {
        return drugsService.saveDrugs(drug);
    }

    @RequestMapping(path="/updatedrug",method = RequestMethod.PUT)
    public Drugs updateDrugs(@RequestBody Drugs drug) {
        return drugsService.updateDrugs(drug);
    }


    @RequestMapping(value="/deldrug/{id}",method = RequestMethod.DELETE)
    public void deleteDrugsById(@PathVariable("id") Long id) {
        drugsService.deleteDrugsById(id);
    }

    @RequestMapping(value="/drugclass/{idcl}",method = RequestMethod.GET)
    public Iterable<Drugs> getDrugsByCategory(@PathVariable("idcl") int idcl) {
        return drugsService.findByDrugClassIdcl(idcl);
    }

    @RequestMapping(value="/genericname/{genericName}",method = RequestMethod.GET)
    public Iterable<Drugs> getDrugsByGenericName(@PathVariable("genericName") String genericName) {
        return drugsService.findByGenericName(genericName);
    }




}
