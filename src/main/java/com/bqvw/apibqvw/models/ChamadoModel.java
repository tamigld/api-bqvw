package com.bqvw.apibqvw.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "tb_chamado")
public class ChamadoModel implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id")
    private UUID id;

    private String descricao;
    private LocalDateTime data_chamado;
    private int status;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private UsuarioModel id_chapa;
}
