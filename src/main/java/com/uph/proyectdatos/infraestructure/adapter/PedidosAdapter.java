package com.uph.proyectdatos.infraestructure.adapter;

import com.uph.proyectdatos.domain.model.PedidosDomain;
import com.uph.proyectdatos.domain.spi.PedidosPort;
import com.uph.proyectdatos.infraestructure.jpa.mapper.PedidosMapper;
import com.uph.proyectdatos.infraestructure.jpa.repository.PedidosRepository;
import java.util.List;

public class PedidosAdapter implements PedidosPort {

  private final PedidosRepository repository;

  private final PedidosMapper mapper;

  public PedidosAdapter(PedidosRepository repository, PedidosMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public void save() {

  }

  @Override
  public PedidosDomain findById(int id) {
    return null;
  }

  @Override
  public List<PedidosDomain> getListPedidos() {
    return null;
  }
}
