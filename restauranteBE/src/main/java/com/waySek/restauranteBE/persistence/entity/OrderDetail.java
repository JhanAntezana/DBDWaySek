package com.waySek.restauranteBE.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "detalleOrden")
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetalleOrden")
    private Integer orderDetailId;
    @Column(name = "idOrden")
    private int orderId;
    @Column(name = "idVenta")
    private int saleId;
    @Column(name = "idMenu")
    private int menuId;
    @Column(name = "idcombo")
    private int comboId;
    @Column(name = "nombreMenu")
    private String menuName;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "cantidad")
    private int quantity;
    @Column(name = "precioUnitario")
    private double price;
    @Column(name = "precioTotal")
    private double totalPrice;
    @Column(name = "esCombo")
    private boolean isCombo;
    @Column(name = "estado")
    private String state;
    @Column(name = "observacion")
    private String observation;
    @Column(name = "notaCocina")
    private String kitchenNote;
    @Column(name = "llevar")
    private boolean carry;
    private boolean delivery;
    @Column(name = "atendidoCocina")
    private boolean servedKirchen;

}
