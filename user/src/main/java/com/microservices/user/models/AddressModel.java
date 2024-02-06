package com.microservices.user.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_Address")
public class AddressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String cep;

    private Integer number;

    private String complemet;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private UserModel user;

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplemet() {
        return complemet;
    }

    public void setComplemet(String complemet) {
        this.complemet = complemet;
    }
}
