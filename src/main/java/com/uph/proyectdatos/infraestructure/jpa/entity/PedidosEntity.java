package com.uph.proyectdatos.infraestructure.jpa.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pedidos")
@NoArgsConstructor
@Data
public class PedidosEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "fecha_pedido")
  private LocalDateTime fecha_pedido;
  @Column(name = "metodo_pago")
  private String metodoPago;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "fk_cliente_id")
  private ClientesEntity clientesEntity;
}
