package com.waySek.restauranteBE.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@Entity
@Table(name = "ordenes")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrden")
    private Integer orderId;
    @Column(name = "idMesa")
    private int tableId;
    @Column(name = "idUsuarioAtencion")
    private int attentionUserId;
    @Column(name = "estado")
    private String condition;
    @Column(name = "motivoEstado")
    private String conditionReason;
    @Column(name = "observacion")
    private String observation;
    @Column(name = "turno")
    private String turn;
    @Column(name = "fechaCreacion")
    private Date creationDate;
    @Column(name = "atendidoCocina")
    private boolean servedKirchen;
    @Column(name = "correlativoDiario")
    private int dailyCorrelative;
}
