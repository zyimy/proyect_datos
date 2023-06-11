package com.uph.proyectdatos.domain.spi;

import com.uph.proyectdatos.domain.model.ClientesDomain;
import java.util.List;

public interface ClientesPort {

  void save(ClientesDomain clientesDomain);
  ClientesDomain findById(int id);
  List<ClientesDomain>getListClientes();
}
