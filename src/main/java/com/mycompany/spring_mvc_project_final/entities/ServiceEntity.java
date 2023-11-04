package com.mycompany.spring_mvc_project_final.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service")
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "service", fetch = FetchType.EAGER)
    private List<ServiceDetailsEntity>serviceDetailsEntityList;

    public ServiceEntity(){
    }

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", serviceDetailsEntityList=" + serviceDetailsEntityList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ServiceDetailsEntity> getServiceDetailsEntityList() {
        return serviceDetailsEntityList;
    }

    public void setServiceDetailsEntityList(List<ServiceDetailsEntity> serviceDetailsEntityList) {
        this.serviceDetailsEntityList = serviceDetailsEntityList;
    }
}
