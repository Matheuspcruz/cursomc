package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(value="/categorias")//EndPoint
public class CategoriaResources {

		@RequestMapping(method=RequestMethod.GET)//Metodo de requisição HTTP, Get pois é uma simples
		public String listar() {
			return "Rest esta funciondando";
		}
}
