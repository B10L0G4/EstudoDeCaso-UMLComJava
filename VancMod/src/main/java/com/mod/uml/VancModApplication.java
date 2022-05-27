<<<<<<< HEAD
package com.mod.uml;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mod.uml.domain.Categoria;
import com.mod.uml.domain.Produto;
import com.mod.uml.repositories.CategoriaRepository;
import com.mod.uml.repositories.ProdutoRepository;

@SpringBootApplication
public class VancModApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaReporsitory; 
	
	@Autowired
	private ProdutoRepository produtoReporsitory; 
	
	public static void main(String[] args) {
		SpringApplication.run(VancModApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
			
		categoriaReporsitory.saveAll(Arrays.asList(cat1, cat2));
		produtoReporsitory.saveAll(Arrays.asList(p1,p2,p3));
	}

}
=======
package com.mod.uml;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mod.uml.domain.Categoria;
import com.mod.uml.domain.Produto;
import com.mod.uml.repositories.CategoriaRepository;
import com.mod.uml.repositories.ProdutoRepository;

@SpringBootApplication
public class VancModApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaReporsitory; 
	
	@Autowired
	private ProdutoRepository produtoReporsitory; 
	
	public static void main(String[] args) {
		SpringApplication.run(VancModApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
			
		categoriaReporsitory.saveAll(Arrays.asList(cat1, cat2));
		produtoReporsitory.saveAll(Arrays.asList(p1,p2,p3));
	}

}
>>>>>>> cb41b0727134f1d011e85ea3a74b529eb6e1097e
