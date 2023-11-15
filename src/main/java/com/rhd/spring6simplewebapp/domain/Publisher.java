package com.rhd.spring6simplewebapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publisher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zip;

    public Publisher() {
    }

    public Publisher(Long id, String publisherName, String address, String city, String state, String zip) {
        this.id = id;
        this.publisherName = publisherName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Publisher [id=" + id + ", publisherName=" + publisherName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + "]";
    }

        

}
