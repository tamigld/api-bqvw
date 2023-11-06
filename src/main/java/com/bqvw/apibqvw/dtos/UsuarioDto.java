package com.bqvw.apibqvw.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.format.DateTimeFormatter;
import java.util.Date;


public record UsuarioDto(
        @NotBlank String nome,
        @NotBlank @Email(message = "É necessário que o e-mail esteja em formato válido.") String email,
        @NotBlank String senha,
        Integer vw_id,
        @DateTimeFormat(pattern = "dd.MM.yyyy") Date data_nascimento
) {
}
