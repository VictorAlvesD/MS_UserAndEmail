package com.microservices.user.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "TB_USERS")
public class UserModel implements Serializable {
    //Serializable para termos controle de versões
    private static final long UID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private String email;

    private String password;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "address_id"))
    private List<AddressModel> address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "user_telephone", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "telephone_id"))
    private List<TelephoneModel> telephones;

    @Enumerated(EnumType.STRING)
    private UserCategory userCategory;

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
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

    public List<AddressModel> getAddress() {
        return address;
    }

    public void setAddress(List<AddressModel> address) {
        this.address = address;
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
