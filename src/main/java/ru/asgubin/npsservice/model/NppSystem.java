package ru.asgubin.npsservice.model;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "systems")
public class NppSystem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "function", length = 200)
    private String function;

    @Column(name = "speciality", length = 50)
    private String speciality;

    @Column(name = "safety_class", length = 50)
    private String safetyClass;

    @Column(name = "npp_id")
    private Long nppId;

    protected NppSystem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSafetyClass() {
        return safetyClass;
    }

    public void setSafetyClass(String safetyClass) {
        this.safetyClass = safetyClass;
    }

    public Long getNppId() {
        return nppId;
    }

    public void setNppId(Long nppId) {
        this.nppId = nppId;
    }
}
