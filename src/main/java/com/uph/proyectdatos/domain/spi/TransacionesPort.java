package com.uph.proyectdatos.domain.spi;

import com.uph.proyectdatos.domain.model.ClientesDomain;
import com.uph.proyectdatos.domain.model.TransaccionesDomain;
import java.util.List;

public interface TransacionesPort {

  void save();
  TransaccionesDomain findById(int id);
  List<TransaccionesDomain>getListTransacciones();
}
