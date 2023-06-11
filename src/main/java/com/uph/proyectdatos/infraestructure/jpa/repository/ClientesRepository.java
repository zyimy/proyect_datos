package com.uph.proyectdatos.infraestructure.jpa.repository;

import com.uph.proyectdatos.infraestructure.jpa.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<ClientesEntity,Integer> {
}
