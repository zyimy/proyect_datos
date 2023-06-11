package com.uph.proyectdatos.domain.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClientesDomain {

  private Integer id;
  private String nombre;
  private String direccion;
  private String telefono;
}
