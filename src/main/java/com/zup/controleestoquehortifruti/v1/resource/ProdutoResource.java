package com.zup.controleestoquehortifruti.v1.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.controleestoquehortifruti.v1.entity.Produto;
import com.zup.controleestoquehortifruti.v1.service.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> retornaProdutos(){
		return ResponseEntity.ok().body(produtoService.buscarTodos());
	}
}
