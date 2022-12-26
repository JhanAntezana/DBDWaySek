package com.waySek.restauranteBE.persistence.entity;

import jakarta.persistence.Column;

import java.util.Date;

public class User {
    @Column(name = "idUsuario")
    private Integer userId;
    @Column(name = "idPerfil")
    private int profileId;
    @Column(name = "idCliente")
    private int clientId;
    @Column(name = "nombre")
    private String firstName;
    @Column(name = "apPaterno")
    private String fLastName;
    @Column(name = "apMaterno")
    private String mLastName;
    private String dni;
    @Column(name = "email")
    private String email;
    @Column(name = "contrasena")
    private String password;
    @Column(name = "fechaNacimiento")
    private Date dateBirth;
    @Column(name = "nombreFoto")
    private String photoUrl;
    @Column(name = "eliminado")
    private boolean deleted;
    @Column(name = "numeroMozo")
    private int WaiterNumber;
    @Column(name = "clave")
    private String pin;

}
