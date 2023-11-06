package com.bqvw.apibqvw.repositories;

import com.bqvw.apibqvw.models.ChamadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ChamadoRepository extends JpaRepository<ChamadoModel, UUID> {
    Optional<ChamadoModel> findById(UUID id); //Optional para caso ele retornar ausente fazer validação
}
