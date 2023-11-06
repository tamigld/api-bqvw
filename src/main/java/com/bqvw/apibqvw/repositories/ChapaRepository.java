package com.bqvw.apibqvw.repositories;

import com.bqvw.apibqvw.models.ChapaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChapaRepository extends JpaRepository<ChapaModel, UUID> {
}
