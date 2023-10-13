package com.icecream.app.rest.Model;

import javax.persistence.*;

@Entity
@Table(name="ice")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="flavor")
    private String flavor;
    @Column(name="price")
    private double price;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getFlavor(){
        return flavor;
    }
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
