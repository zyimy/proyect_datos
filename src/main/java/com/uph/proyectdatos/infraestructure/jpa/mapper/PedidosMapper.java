package com.uph.proyectdatos.infraestructure.jpa.mapper;

import com.uph.proyectdatos.domain.model.PedidosDomain;
import com.uph.proyectdatos.infraestructure.jpa.entity.PedidosEntity;
import org.mapstruct.*;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    componentModel = "spring")
public interface PedidosMapper {

  PedidosDomain toDomain(PedidosEntity entity);

  PedidosEntity toEntity(PedidosDomain domain);
}
