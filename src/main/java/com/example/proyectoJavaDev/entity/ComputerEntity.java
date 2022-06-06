package com.example.proyectoJavaDev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "computadoras")
public class ComputerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_serie")
    private String serialId = "";

    @Column(name = "id_empleado")
    private Integer employeeId = 0;

    @Column(name = "modelo")
    private String model = "";

    @Column(name = "marca")
    private String make = "";

    @Column(name = "precio")
    private String price = "";

    public ComputerEntity() {}

    public ComputerEntity(String serialId, Integer employeeId, String model, String make, String price) {
        this.serialId = serialId;
        this.employeeId = employeeId;
        this.model = model;
        this.make = make;
        this.price = price;
    }

    public String getSerialId() {
        return serialId;
    }

    public Integer getEmployeeId() { return employeeId; }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getPrice() {
        return price;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public void setEmployeeId(Integer employeeId) { this.employeeId = employeeId; }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
