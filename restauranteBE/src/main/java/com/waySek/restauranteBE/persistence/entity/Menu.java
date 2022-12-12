package com.waySek.restauranteBE.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmenu")
    private Integer menuId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "precio")
    private double price;
    @Column(name = "idcategoriamenu")
    private Integer menuCategoryId;
    @Column(name = "eliminado")
    private boolean deleted;
    private boolean visible;

}
