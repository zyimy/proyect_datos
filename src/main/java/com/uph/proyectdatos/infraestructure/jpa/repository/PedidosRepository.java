package com.uph.proyectdatos.infraestructure.jpa.repository;

import com.uph.proyectdatos.infraestructure.jpa.entity.PedidosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<PedidosEntity,Integer> {
}
