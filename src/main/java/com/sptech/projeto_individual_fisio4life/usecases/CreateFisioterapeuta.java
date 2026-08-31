package com.sptech.projeto_individual_fisio4life.usecases;

import com.sptech.projeto_individual_fisio4life.entities.Fisioterapeuta;
import com.sptech.projeto_individual_fisio4life.repositories.FisioterapeutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateFisioterapeuta {

    @Autowired
    private FisioterapeutaRepository fisioterapeutaRepository;

    public CreateFisioterapeuta(FisioterapeutaRepository fisioterapeutaRepository) {
        this.fisioterapeutaRepository = fisioterapeutaRepository;
    }

    public ResponseEntity<String> execute(Fisioterapeuta fisioterapeuta){

        Integer linhas_afetadas = fisioterapeutaRepository.create(fisioterapeuta);

        if (linhas_afetadas == 1) {
            return ResponseEntity.status(201).body("Fisioterapeuta criado com sucesso!");
        }

        return ResponseEntity.status(400).body("Erro ao criar fisioterapeuta!");

    }

}
