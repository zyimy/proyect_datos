package com.uph.proyectdatos.infraestructure.adapter;

import com.uph.proyectdatos.domain.model.ProductosDomain;
import com.uph.proyectdatos.domain.spi.ProductoPort;
import com.uph.proyectdatos.infraestructure.jpa.mapper.ProductosMapper;
import com.uph.proyectdatos.infraestructure.jpa.repository.ProductosRepository;
import java.util.List;

public class ProductosAdapter implements ProductoPort {

  private final ProductosRepository repository;

  private final ProductosMapper mapper;

  public ProductosAdapter(ProductosRepository repository, ProductosMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public void save() {

  }

  @Override
  public ProductosDomain findById(int id) {
    return null;
  }

  @Override
  public List<ProductosDomain> getListProduct() {
    return null;
  }
}
