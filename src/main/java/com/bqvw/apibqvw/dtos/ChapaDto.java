package com.bqvw.apibqvw.dtos;

import jakarta.validation.constraints.NotBlank;

public record ChapaDto(
        @NotBlank String nome
) {
}
