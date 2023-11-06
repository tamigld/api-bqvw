package com.bqvw.apibqvw.dtos;

import jakarta.validation.constraints.NotNull;

public record PerguntaDto(
        @NotNull String titulo
) {
}
