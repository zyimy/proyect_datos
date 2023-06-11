package com.uph.proyectdatos.domain.model;

import com.uph.proyectdatos.infraestructure.jpa.entity.ClientesEntity;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PedidosDomain {

  private Integer id;
  private LocalDateTime fecha_pedido;
  private String metodoPago;
  private ClientesEntity clientesEntity;
}
