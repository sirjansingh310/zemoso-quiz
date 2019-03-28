package com.zemoso.inventorymanagement.model;


import javax.persistence.*;
//spring Model for the user

@Entity
@Table(name = "employee")
public class Employee {

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String  firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    //setter and getter methods of user details attributes
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
