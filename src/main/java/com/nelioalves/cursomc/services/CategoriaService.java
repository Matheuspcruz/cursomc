package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exception.ObjectNotFoundException;

@Service //Camada de serviço, chama a camada de acesso a dados
public class CategoriaService {

	@Autowired //Instancia a dependencia automaticamente
	private CategoriaRepository repo; //Dependencia de um obejeto
	
	public Categoria buscar(Integer id) { 
		
		Optional<Categoria> obj = repo.findById(id);//busca uma categoria no banco de dados 
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! " + id + ", Tipo: " + Categoria.class.getName() ));
		//Retorna obj ou dispara uma exeção personalizada 
		
	}
	
}
