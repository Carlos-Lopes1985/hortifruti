package com.zup.controleestoquehortifruti.v1;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zup.controleestoquehortifruti.v1.entity.Estoque;
import com.zup.controleestoquehortifruti.v1.entity.Grupo;
import com.zup.controleestoquehortifruti.v1.entity.Lote;
import com.zup.controleestoquehortifruti.v1.entity.Produto;
import com.zup.controleestoquehortifruti.v1.entity.Saida;
import com.zup.controleestoquehortifruti.v1.entity.UnidadeMedida;
import com.zup.controleestoquehortifruti.v1.repository.EstoqueRepository;
import com.zup.controleestoquehortifruti.v1.repository.GrupoRepository;
import com.zup.controleestoquehortifruti.v1.repository.LoteRepository;
import com.zup.controleestoquehortifruti.v1.repository.ProdutoRepository;
import com.zup.controleestoquehortifruti.v1.repository.SaidaRepository;
import com.zup.controleestoquehortifruti.v1.repository.UnidadeMedidaRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Autowired
	private UnidadeMedidaRepository unidadeMedidaRepository;
	
	@Autowired
	private LoteRepository loteRepository;
	
	@Autowired
	private SaidaRepository saidaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Grupo grupo  = new Grupo(null,"Frutas");
		Grupo grupo1 = new Grupo(null,"Eletrodoméstico");
		Grupo grupo2 = new Grupo(null,"Legumes");
		Grupo grupo3 = new Grupo(null,"Verduras");
		Grupo grupo4 = new Grupo(null,"Raiz");
		
		grupoRepository.saveAll(Arrays.asList(grupo,grupo1,grupo2,grupo3,grupo4));
		
		Produto p1 = new Produto(null, "Tomate",grupo);
		Produto p2 = new Produto(null, "Limão",grupo);
		Produto p3 = new Produto(null, "Beterraba",grupo4);
		Produto p4 = new Produto(null, "Televisão",grupo1);
		Produto p5 = new Produto(null, "Geladeira",grupo1);
		Produto p6 = new Produto(null, "Alface",grupo3);
		Produto p7 = new Produto(null, "Maça",grupo);
		Produto p8 = new Produto(null, "Uva",grupo);
		Produto p9 = new Produto(null, "Melancia",grupo);
		Produto p10 = new Produto(null, "Abacate",grupo);
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));
		
		UnidadeMedida u1 = new UnidadeMedida(null,"Kg");
		UnidadeMedida u2 = new UnidadeMedida(null,"Unidade");
		
		unidadeMedidaRepository.saveAll(Arrays.asList(u1,u2));
		
		Lote l1 = new Lote(null, 20, LocalDate.of(2020, 07, 01), LocalDate.of(2020, 7, 30));
		Lote l2 = new Lote(null, 20, LocalDate.of(2020, 07, 02), LocalDate.of(2020, 8, 4));
		Lote l3 = new Lote(null, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));
		Lote l4 = new Lote(null, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));
		Lote l5 = new Lote(null, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));
		Lote l6 = new Lote(null, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));
		Lote l7 = new Lote(null, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));
		Lote l8 = new Lote(null, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));
		Lote l9 = new Lote(null, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));
		Lote l10 = new Lote(null, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));

		loteRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10));
		
		Estoque es1  = new Estoque(null,100,p1,u1,l1);
		Estoque es2  = new Estoque(null,90,p2,u1,l4);
		Estoque es3  = new Estoque(null,1,p10,u1,l3);
		Estoque es4  = new Estoque(null,10,p4,u2,l2);
		Estoque es5  = new Estoque(null,1000,p3,u1,l10);
		Estoque es6  = new Estoque(null,300,p6,u1,l7);
		Estoque es7  = new Estoque(null,80,p9,u1,l8);
		Estoque es8  = new Estoque(null,26,p7,u1,l6);
		Estoque es9  = new Estoque(null,15,p5,u2,l5);
		Estoque es10 = new Estoque(null,23,p8,u1,l9);
		
		estoqueRepository.saveAll(Arrays.asList(es1,es2,es3,es4,es5,es6,es7,es8,es9,es10));
		
		Saida s1 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es1);
		Saida s2 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es1);
		Saida s3 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es10);
		Saida s4 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es7);
		Saida s5 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es5);
		Saida s6 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es6);
		Saida s7 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es9);
		Saida s8 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es9);
		Saida s9 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es4);
		Saida s10 = new Saida(null, 10, LocalDate.of(2020, 07, 11),es4);
		
		saidaRepository.saveAll(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10));
		
//		List<Produto>prds = new ArrayList<Produto>();
//		
//		p1.setLotes(Arrays.asList(l1));
//		p2.setLotes(Arrays.asList(l2));
//		p3.setLotes(Arrays.asList(l3));
//		p3.setLotes(Arrays.asList(l4));
//		
//		loteRepository.saveAll(Arrays.asList(l1,l2,l3,l4));
//		
//		List<Produto> pdrs = produtoRepository.findAll();
//
//			Integer quantidade = 0;
//		for (int i = 0; i < pdrs.size(); i++) {
//			System.out.println("PASSOU AKI!!!");
//			for (int j = 0; j < pdrs.get(i).getLote().size(); j++) {
//				System.out.println("Passou aki 2");
////				quantidade += pdrs.get(i).getLote().get(j).getQtdeLote();
//			}
//			System.out.println("Quantidade: "+ quantidade);
//		}
//		
//		for (int i = 0; i < prds.size(); i++) {
//			
////			if( prds.get(i).getQuantidade() < 50) {
////				System.out.println("Fazer pedido de produto: " + prds.get(i).getNome() );
////			}
////			
////			LocalDate dataValidade = prds.get(i).getLote().getDataValidade();
////			Period periodo = Period.between(LocalDate.now(),dataValidade);
////			
////			int per = periodo.getDays();
////			
////			System.out.println(per);
////			
////			if(per <= 10) {
////				System.out.println("Entrar em oferta");
////			}
////		}
//		
		}
	}

