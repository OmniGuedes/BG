package com.example.demo.models;

import javax.persistence.*;


@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "reference", length = 100, nullable = false)
    private String reference;

    @Column(name = "type", length = 100,  nullable = false)
    private Integer type;

    @Column(name = "model", length = 100, nullable = false)
    private String model;

    @Column(name = "brand", length = 100, nullable = false)
    private String brand;

    @Column(name = "size", length = 100,  nullable = false)
    private Integer size;

    @Column(name = "acquisition_date", length = 100, nullable = false)
    private String acquisition_date;

    @Column(name = "sale_date", length = 100, nullable = false)
    private String sale_date;

    @Column(name = "sale_cost", length = 100, nullable = false)
    private float sale_cost;

    @Column(name = "acquisition_cost", length = 100, nullable = false)
    private float acquisition_cost;

    @Column(name = "supplier", length = 100, nullable = false)
    private String supplier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getAcquisition_date() {
        return acquisition_date;
    }

    public void setAcquisition_date(String acquisition_date) {
        this.acquisition_date = acquisition_date;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public float getSale_cost() {
        return sale_cost;
    }

    public void setSale_cost(float sale_cost) {
        this.sale_cost = sale_cost;
    }

    public float getAcquisition_cost() {
        return acquisition_cost;
    }

    public void setAcquisition_cost(float acquisition_cost) {
        this.acquisition_cost = acquisition_cost;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
