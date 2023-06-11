package com.uph.proyectdatos.infraestructure.adapter;

import com.uph.proyectdatos.domain.model.ClientesDomain;
import com.uph.proyectdatos.domain.spi.ClientesPort;
import com.uph.proyectdatos.infraestructure.jpa.mapper.ClientesMapper;
import com.uph.proyectdatos.infraestructure.jpa.repository.ClientesRepository;
import java.util.List;

public class ClientesAdapter implements ClientesPort {

  private final ClientesRepository repository;

  private final ClientesMapper mapper;

  public ClientesAdapter(ClientesRepository repository, ClientesMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public void save(ClientesDomain clientesDomain) {
    mapper.toDomain(repository.save(mapper.toEntity(clientesDomain)));
  }

  @Override
  public ClientesDomain findById(int id) {
    return mapper.toDomain(repository.findById(id).orElse(null));
  }

  @Override
  public List<ClientesDomain> getListClientes() {
    return mapper.toDoamin(repository.findAll());
  }
}
