package com.microservices.user.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "TB_USERS")
public class UserModel implements Serializable {
    //Serializable para termos controle de versões
    private static final long UID = 1L;

    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AdressModel> addresses;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TelephoneModel> telephones;

    @Enumerated(EnumType.STRING)
    private UserCategory userCategory;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AdressModel> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AdressModel> addresses) {
        this.addresses = addresses;
    }

    public List<TelephoneModel> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<TelephoneModel> telephones) {
        this.telephones = telephones;
    }

    public UserCategory getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(UserCategory userCategory) {
        this.userCategory = userCategory;
    }
}
