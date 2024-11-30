package com.aula.relacionamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aula.relacionamento.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
