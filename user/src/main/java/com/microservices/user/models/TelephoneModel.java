package com.microservices.user.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_Telephone")
public class TelephoneModel {
    @Id
    private Long id;

    private String number;

    private String ddd;

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "User_id")
    private UserModel user;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
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
