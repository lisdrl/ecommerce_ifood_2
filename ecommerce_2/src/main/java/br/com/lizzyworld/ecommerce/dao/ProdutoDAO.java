package br.com.lizzyworld.ecommerce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.lizzyworld.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

	public List<Produto> findByNomeContainingOrDescricaoContaining(String nome, String descricao);
	
	//	Cabeçalhos dos métodos de ProdutoController
	
}
