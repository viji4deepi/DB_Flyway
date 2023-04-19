package com.example.flyway.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "REGISTRATION_USERS")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String mobile;
}
