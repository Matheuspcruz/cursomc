package com.nelioalves.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

	@RestController
	@RequestMapping(value="/categorias")//EndPoint
public class CategoriaResources {

		@Autowired
		private CategoriaService service; //Acessando um serviço
		
		@RequestMapping(value="/{id}",method=RequestMethod.GET)//Metodo de requisição HTTP, Get pois é uma simples
		public ResponseEntity<?> find(@PathVariable Integer id) //PathVariable informa que o ID vai vir da url, tipo ResponseEntity é um tipo especial do spring para pegar um retorno de serviço REST
		{
			
			Categoria obj = service.buscar(id); //Passa o ID para camada de Serviço
			return ResponseEntity.ok().body(obj); //Retorna o Obj que buscou por ID 
		}
}
