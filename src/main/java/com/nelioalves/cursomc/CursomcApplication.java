package com.nelioalves.cursomc;	

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner { //permitir implementar um metodo auxiliar para executar uma ação quando o program iniciar
	
	@Autowired
	private CategoriaRepository categoriaRepository;//Dependencia 
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// CommandLineRunner starta junto com a inicialização do programa
		
		Categoria cat1 = new Categoria(null,  "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		//Metodo salvAll salva as categorias no banco
		//Array.asList salva mais de uma instancia 
	}
}
