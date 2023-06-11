package com.uph.proyectdatos.infraestructure.jpa.mapper;

import com.uph.proyectdatos.domain.model.PedidosDomain;
import com.uph.proyectdatos.domain.model.ProductosDomain;
import com.uph.proyectdatos.infraestructure.jpa.entity.PedidosEntity;
import com.uph.proyectdatos.infraestructure.jpa.entity.ProductosEntity;
import org.mapstruct.*;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    componentModel = "spring")
public interface ProductosMapper {

  ProductosDomain toDomain(ProductosEntity entity);

  ProductosEntity toEntity(ProductosDomain domain);
}
