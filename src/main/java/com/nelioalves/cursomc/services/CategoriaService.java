package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

@Service //Camada de serviço, chama a camada de acesso a dados
public class CategoriaService {

	@Autowired //Instancia a dependencia automaticamente
	private CategoriaRepository repo; //Dependencia de um obejeto
	
	public Categoria buscar(Integer id) { 
		Optional<Categoria> obj = repo.findById(id);//busca uma categoria no banco de dados 
		return obj.orElse(null);//Retorna obj ou nulo;
		
	}
	
}
