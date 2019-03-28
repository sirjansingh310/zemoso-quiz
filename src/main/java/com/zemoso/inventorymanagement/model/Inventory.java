package com.zemoso.inventorymanagement.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    //private Employee employee;

    @Column(name = "type")
    private String type;

    @Column(name = "issued-at")
    private LocalDateTime issedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getIssedAt() {
        return issedAt;
    }

    public void setIssedAt(LocalDateTime issedAt) {
        this.issedAt = issedAt;
    }
}
