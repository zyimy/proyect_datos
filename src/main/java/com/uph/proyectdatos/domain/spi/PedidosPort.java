package com.uph.proyectdatos.domain.spi;

import com.uph.proyectdatos.domain.model.PedidosDomain;
import com.uph.proyectdatos.domain.model.ProductosDomain;
import java.util.List;

public interface PedidosPort {

  void save();
  PedidosDomain findById(int id);
  List<PedidosDomain>getListPedidos();
}
