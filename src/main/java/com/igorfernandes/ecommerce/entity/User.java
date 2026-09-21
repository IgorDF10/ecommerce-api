package com.igorfernandes.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import com.igorfernandes.ecommerce.enums.Role;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

}
