package com.ejemplo.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Entity
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "birtdate")
    String birtdate;

    @Column(name = "phone")
    String phone;

    @Column(name = "country")
    String country;

    @Column(name = "city")
    String city;

    @Column(name = "direction")
    String direction;

    @Column(name = "postcode")
    String postcode;
}
