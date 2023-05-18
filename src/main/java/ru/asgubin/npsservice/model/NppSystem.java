package ru.asgubin.npsservice.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "systems")
public class NppSystem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "function", length = 200)
    private String function;

    @Column(name = "speciality", length = 50)
    private String speciality;

    @Column(name = "safetyClass", length = 50)
    private String safetyClass;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "nppId", nullable = true)
    private Npp nppId;

    protected NppSystem() {
    }

    public NppSystem(String name, String function, String speciality, String safetyClass, Npp nppId) {
        this.name = name;
        this.function = function;
        this.speciality = speciality;
        this.safetyClass = safetyClass;
        this.nppId = nppId;
    }

    public NppSystem(String name, String function, String speciality, String safetyClass) {
        this.name = name;
        this.function = function;
        this.speciality = speciality;
        this.safetyClass = safetyClass;
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

    public Npp getNppId() {
        return nppId;
    }

    public void setNppId(Npp nppId) {
        this.nppId = nppId;
    }
}
