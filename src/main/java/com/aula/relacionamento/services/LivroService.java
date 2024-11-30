package com.aula.relacionamento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.relacionamento.entities.Livro;
import com.aula.relacionamento.repositories.LivroRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
	
public class LivroService {
	@Autowired
	private LivroRepository livroRepository;
	
	public List<Livro> getAllLivros(){
		return livroRepository.findAll();
	}
	
	public void saveLivros (Livro livro){
		livroRepository.save(livro);
	}
	
}
