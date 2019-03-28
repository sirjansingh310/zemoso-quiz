package com.zemoso.inventorymanagement.model;


import javax.persistence.*;
import java.sql.Blob;

//spring Model for the user

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false,unique = true)
    private String  firstName;

    @Column(name = "type",nullable = false)
    private String lastName;

    //setter and getter methods of user details attributes
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
