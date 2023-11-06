package com.bqvw.apibqvw.dtos;

import com.bqvw.apibqvw.models.UsuarioModel;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record ChamadoDto(
        @NotBlank String descricao,
        @NotBlank LocalDateTime data_chamado,
        @NotBlank int status,

        UsuarioModel usuario
) {
}
