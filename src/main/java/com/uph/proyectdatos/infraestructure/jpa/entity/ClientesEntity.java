package com.uph.proyectdatos.infraestructure.jpa.entity;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@NoArgsConstructor
@Data
public class ClientesEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "nombre")
  private String nombre;
  @Column(name = "direccion")
  private String direccion;
  @Column(name = "telefono")
  private String telefono;
}
