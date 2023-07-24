package com.platzi.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "cliente")
public class cliente {
    private String id;
    private String nombre;
    private String apellidos;
    private Double celular;
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;
}
