package br.com.sistema.loja;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer quantidade;
	
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
