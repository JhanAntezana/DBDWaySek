package com.waySek.restauranteBE.persistence.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "mesas")
public class AtentionTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmesa")
    private Integer tableId;
    @Column(name = "idzona")
    private Integer zoneId;
    @Column(name = "numero")
    private String number;
    @Column(name = "capacidad")
    private int capacity;
    @Column(name = "estado")
    private String state;
}
