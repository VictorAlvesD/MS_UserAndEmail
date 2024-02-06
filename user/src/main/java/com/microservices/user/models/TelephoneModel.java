package com.microservices.user.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_Telephone")
public class TelephoneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String number;

    private String ddd;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private UserModel user;

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
