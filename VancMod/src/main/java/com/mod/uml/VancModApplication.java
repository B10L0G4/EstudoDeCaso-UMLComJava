package com.mod.uml;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mod.uml.domain.Categoria;
import com.mod.uml.domain.Cidade;
import com.mod.uml.domain.Cliente;
import com.mod.uml.domain.Endereco;
import com.mod.uml.domain.Estado;
import com.mod.uml.domain.Produto;
import com.mod.uml.domain.enuns.TipoCliente;
import com.mod.uml.repositories.CategoriaRepository;
import com.mod.uml.repositories.CidadeRepository;
import com.mod.uml.repositories.ClienteRepository;
import com.mod.uml.repositories.EnderecoRepository;
import com.mod.uml.repositories.EstadoRepository;
import com.mod.uml.repositories.ProdutoRepository;

@SpringBootApplication
public class VancModApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(VancModApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProduto().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProduto().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Estado est1 =new Estado(null, "Minas Gerais");
		Estado est2 =new Estado(null, "São Paulo");
		
		Cidade c1 =new Cidade(null, " Uberlândia", est1);
		Cidade c2 =new Cidade(null, " São Paulo", est2);
		Cidade c3 =new Cidade(null, " Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est1.getCidades().addAll(Arrays.asList(c2,c3));

		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		Cliente cli1= new Cliente(null, "Maria Silva", "maria@gmail.com","1234567891",TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("4569874587","125478563"));
		
		Endereco e1= new Endereco(null,"Rua Flores", "300", "APto 303","Jardim","32146586",cli1, c1);
		Endereco e2= new Endereco(null,"Rua Cravos", "300", "APto 603","Rosa","65896544",cli1, c2);
		
		cli1.getEndereco().addAll(Arrays.asList(e1,e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
	}

}
