package com.microservices.user.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_Adress")
public class AdressModel {

    @Id
    private Long id;

    private String cep;

    private Integer number;

    private String complemet;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private UserModel user;

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public Long getId() {
        return id;
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
