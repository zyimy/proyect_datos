package com.uph.proyectdatos.infraestructure.jpa.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transacciones")
@NoArgsConstructor
@Data
public class TransaccionesEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "fecha_transaccion")
  private LocalDateTime fecha_transaccion;
  @Column(name = "metodo_pago")
  private String metodoPago;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "fk_pedido_id")
  private PedidosEntity pedidosEntity;
}
