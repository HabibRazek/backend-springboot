package com.walter.drugs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.util.List;

@Entity

public class DrugClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcl;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "drugClass")
    private List<Drugs> drugs;




    //constructor
    public DrugClass() {
        super();
    }

    // Getters and Setters
    public Integer getIdcl() {
        return idcl;
    }
    public void setIdcl(Integer idcl) {
        this.idcl = idcl;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Drugs> getDrugs() {
        return drugs;
    }
    public void setDrugs(List<Drugs> drugs) {
        this.drugs = drugs;
    }



}
