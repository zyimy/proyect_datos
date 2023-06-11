package com.uph.proyectdatos.infraestructure.jpa.repository;

import com.uph.proyectdatos.infraestructure.jpa.entity.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<ProductosEntity,Integer> {
}
