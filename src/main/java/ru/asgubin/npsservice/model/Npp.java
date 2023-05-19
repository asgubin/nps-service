package ru.asgubin.npsservice.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "npp")
public class Npp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

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
