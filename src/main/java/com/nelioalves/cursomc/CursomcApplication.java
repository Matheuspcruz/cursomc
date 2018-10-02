package com.nelioalves.cursomc;	

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner { //permitir implementar um metodo auxiliar para executar uma ação quando o program iniciar
	
	@Autowired
	private CategoriaRepository categoriaRepository;//Dependencia 
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// CommandLineRunner starta junto com a inicialização do programa
		
		Categoria cat1 = new Categoria(null,  "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProduto().addAll(Arrays.asList(p1,p2,p3));//Relaciona o Produto com a categoria 
		cat2.getProduto().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1)); //Relacionando Categoria a produto
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		//Metodo salvAll salva as categorias no banco
		//Array.asList salva mais de uma instancia 
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
	}
}
