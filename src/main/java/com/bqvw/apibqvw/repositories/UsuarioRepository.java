package com.bqvw.apibqvw.repositories;

import com.bqvw.apibqvw.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
    UsuarioModel findByEmail(String email);
}
