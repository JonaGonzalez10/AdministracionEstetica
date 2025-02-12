package com.example.EsteticaMersy.entity;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_Empleados")
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long EmpleadoId;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private int Telefono;

    // Para modificar la columna se usa ->
    @Column(name="email_address", unique=true,nullable = false)
    private String email;







}
