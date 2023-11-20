package com.walter.drugs.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "genericName",types = Drugs.class)
public interface DrugProjection {
    public String getGenericName();
}