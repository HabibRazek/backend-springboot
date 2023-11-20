package com.walter.drugs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Drugs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String genericName;
    private String brandNames;
    private String dosageForm;
    private Date lastUpdated;
    @ManyToOne
    private  DrugClass drugClass;

    @OneToMany (mappedBy = "drugs")
    @JsonIgnore
    private List<Image> images;

    private String imagePath;

    public Drugs(Long id, String genericName, String brandNames, String dosageForm, Date lastUpdated, DrugClass drugClass, List<Image> images, String imagePath) {
        this.id = id;
        this.genericName = genericName;
        this.brandNames = brandNames;
        this.dosageForm = dosageForm;
        this.lastUpdated = lastUpdated;
        this.drugClass = drugClass;
        this.images = images;
        this.imagePath = imagePath;
    }

    public Drugs() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getBrandNames() {
        return brandNames;
    }

    public void setBrandNames(String brandNames) {
        this.brandNames = brandNames;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public DrugClass getDrugClass() {
        return drugClass;
    }

    public void setDrugClass(DrugClass drugClass) {
        this.drugClass = drugClass;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
