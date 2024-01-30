package com.microservices.user.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "TB_USERS")
public class UserModel implements Serializable {
    private static final long UID = 1L;
    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

    private String adress;

    private String telephone;

    private String userCategory;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    //Serializable para termos controle de versões

}
