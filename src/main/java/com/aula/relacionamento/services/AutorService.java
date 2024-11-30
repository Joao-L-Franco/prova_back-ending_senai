package com.aula.relacionamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.relacionamento.entities.Autor;
import com.aula.relacionamento.repositories.AutorRepository;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAllAutores() {
        return autorRepository.findAll();
    }

    public void saveAutor(Autor autor) {
        autorRepository.save(autor);
    }
}
