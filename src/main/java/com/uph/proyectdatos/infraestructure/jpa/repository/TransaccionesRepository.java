package com.uph.proyectdatos.infraestructure.jpa.repository;

import com.uph.proyectdatos.infraestructure.jpa.entity.TransaccionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionesRepository extends JpaRepository<TransaccionesEntity,Integer> {
}
