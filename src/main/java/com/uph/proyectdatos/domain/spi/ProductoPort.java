package com.uph.proyectdatos.domain.spi;

import com.uph.proyectdatos.domain.model.ProductosDomain;
import java.util.List;

public interface ProductoPort {

  void save();
  ProductosDomain findById(int id);
  List<ProductosDomain>getListProduct();
}
