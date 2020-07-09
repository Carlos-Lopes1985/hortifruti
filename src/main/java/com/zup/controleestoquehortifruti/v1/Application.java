package com.zup.controleestoquehortifruti.v1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zup.controleestoquehortifruti.v1.entity.Lote;
import com.zup.controleestoquehortifruti.v1.entity.Produto;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Produto p1 = new Produto(null, "Tomate", 5.16, 1050,1);
		Produto p2 = new Produto(null, "Limão", 3.15, 560,1);
		Produto p3 = new Produto(null, "Laranja", 8.15, 34,1);
		
		Lote l1 = new Lote(null, 111222, 20, LocalDate.of(2020, 07, 01), LocalDate.of(2020, 7, 30));
		Lote l2 = new Lote(null, 111225, 20, LocalDate.of(2020, 07, 02), LocalDate.of(2020, 8, 4));
		Lote l3 = new Lote(null, 111229, 20, LocalDate.of(2020, 07, 05), LocalDate.of(2020, 8, 8));
		
		p1.setLote(l1);
		p2.setLote(l3);
		p3.setLote(l2);
		
		l1.setProduto(p1);
		l2.setProduto(p3);
		l3.setProduto(p2);
		
		List<Produto>prds = new ArrayList<Produto>();
		
		prds.addAll(Arrays.asList(p1,p2,p3));
		
		for (int i = 0; i < prds.size(); i++) {
			
			if( prds.get(i).getQuantidade() < 50) {
				System.out.println("Fazer pedido de produto: " + prds.get(i).getNome() );
			}
			
			LocalDate dataValidade = prds.get(i).getLote().getDataValidade();
			Period periodo = Period.between(LocalDate.now(),dataValidade);
			
			int per = periodo.getDays();
			
			System.out.println(per);
			
			if(per <= 10) {
				System.out.println("Entrar em oferta");
			}
		}
		
	}

}
