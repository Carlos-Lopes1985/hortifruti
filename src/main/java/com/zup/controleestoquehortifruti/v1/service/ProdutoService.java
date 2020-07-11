package com.zup.controleestoquehortifruti.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup.controleestoquehortifruti.v1.entity.Produto;
import com.zup.controleestoquehortifruti.v1.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto>buscarTodos(){
		return produtoRepository.findAll();
	}
	
	public List<Produto>verificarQuantidadeProduto(){
		List<Produto>prds = buscarTodos();
		
		return prds;		
	}
}
