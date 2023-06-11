package com.uph.proyectdatos.domain.model;

import com.uph.proyectdatos.infraestructure.jpa.entity.PedidosEntity;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TransaccionesDomain {

  private Integer id;
  private LocalDateTime fecha_transaccion;
  private String metodoPago;
  private PedidosEntity pedidosEntity;
}
