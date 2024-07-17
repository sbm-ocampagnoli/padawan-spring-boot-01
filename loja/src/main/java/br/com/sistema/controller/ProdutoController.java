package br.com.sistema.controller;

import org.hibernate.mapping.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.loja.Produto;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {
	
	@GetMapping
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity adicionarProduto(@RequestBody Produto produto) {
        produtoRepository.save(produto);
        return ResponseEntity.status(201).build();
    }
}
