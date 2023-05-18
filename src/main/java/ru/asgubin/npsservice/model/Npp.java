package ru.asgubin.npsservice.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "npp")
public class Npp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "reactor", length = 50)
    private String reactor;

    @Column(name = "customer", length = 200)
    private String customer;

    @Column(name = "location", length = 200)
    private String location;

    @Column(name = "stage", length = 50)
    private String stage;

    protected Npp() {
    }

    public Npp(String name, String reactor, String customer, String location, String stage) {
        this.name = name;
        this.reactor = reactor;
        this.customer = customer;
        this.location = location;
        this.stage = stage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReactor() {
        return reactor;
    }

    public void setReactor(String reactor) {
        this.reactor = reactor;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
