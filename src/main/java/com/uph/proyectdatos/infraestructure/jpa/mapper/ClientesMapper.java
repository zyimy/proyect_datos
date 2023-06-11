package com.uph.proyectdatos.infraestructure.jpa.mapper;

import com.uph.proyectdatos.domain.model.ClientesDomain;
import com.uph.proyectdatos.domain.model.PedidosDomain;
import com.uph.proyectdatos.infraestructure.jpa.entity.ClientesEntity;
import com.uph.proyectdatos.infraestructure.jpa.entity.PedidosEntity;
import java.util.List;
import org.mapstruct.*;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    componentModel = "spring")
public interface ClientesMapper {

  ClientesDomain toDomain(ClientesEntity entity);

  ClientesEntity toEntity(ClientesDomain domain);

  List<ClientesDomain>toDoamin(List<ClientesEntity>entities);
}
