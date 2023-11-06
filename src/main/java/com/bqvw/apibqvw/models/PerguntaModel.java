package com.bqvw.apibqvw.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "tb_pergunta")
public class PerguntaModel implements Serializable{
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_chapa", referencedColumnName = "id")
    private ChapaModel id_chapa;

    private String titulo;
}
