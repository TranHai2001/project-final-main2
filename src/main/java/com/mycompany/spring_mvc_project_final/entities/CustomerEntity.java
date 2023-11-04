package com.mycompany.spring_mvc_project_final.entities;

import javax.persistence.*;

@Entity
@Table(name ="customer")
public class CustomerEntity extends AccountEntity {
    public CustomerEntity(){
    }
}
