package com.bqvw.apibqvw.controllers;

import com.bqvw.apibqvw.dtos.PerguntaDto;
import com.bqvw.apibqvw.models.PerguntaModel;
import com.bqvw.apibqvw.repositories.PerguntaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/pergunta", produces = {"application/json"})
public class PerguntaController {
    @Autowired
    PerguntaRepository perguntaRepository;

    @GetMapping
    public ResponseEntity<List<PerguntaModel>> listarPergunta(){
        return ResponseEntity.status(HttpStatus.OK).body(perguntaRepository.findAll());
    }

    @GetMapping("/{idPergunta}")
    public ResponseEntity<Object> buscarPergunta(@PathVariable(value = "idPergunta") UUID id) {
        Optional<PerguntaModel> perguntaBuscada = perguntaRepository.findById(id);

        if (perguntaBuscada.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pergunta não encontrada!");
        }

        return ResponseEntity.status(HttpStatus.OK).body(perguntaBuscada.get());
    }

    @PostMapping
    public ResponseEntity<Object> criarPergunta(@RequestBody @Valid PerguntaDto perguntaDto) {
        PerguntaModel pergunta = new PerguntaModel();

        BeanUtils.copyProperties(perguntaDto, pergunta);

        return ResponseEntity.status(HttpStatus.CREATED).body(perguntaRepository.save(pergunta));
    }

    @DeleteMapping("/{idPergunta}")
    public ResponseEntity<Object> deletarPergunta(@PathVariable(value = "idPergunta") UUID id) {
        Optional<PerguntaModel> perguntaBuscada = (perguntaRepository.findById(id));

        if (perguntaBuscada.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pergunta não encontrada");
        }

        perguntaRepository.delete(perguntaBuscada.get());

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Pergunta deletada com sucesso!");
    }
}
