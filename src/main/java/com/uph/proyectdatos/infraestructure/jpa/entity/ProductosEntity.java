package com.uph.proyectdatos.infraestructure.jpa.entity;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@Data
public class ProductosEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "nombre")
  private String nombre;
  @Column(name = "descripcion")
  private String descripcion;
  @Column(name = "categoria")
  private String categoria;
  @Column(name = "precio")
  private double precio;
  @Column(name = "disponibilidad")
  private boolean disponibilidad;
}
