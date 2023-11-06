package com.bqvw.apibqvw.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class UsuarioModel implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id")
    private UUID id;

    private Integer tipo_usuario;
    private String nome;
    private String email;
    private String senha;
    private Integer vw_id;
    private Date data_nascimento;

    @ManyToOne
    @JoinColumn(name = "id_chapa", referencedColumnName = "id")
    private ChapaModel id_chapa;
}
