package br.com.lizzyworld.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.lizzyworld.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {
	
}
