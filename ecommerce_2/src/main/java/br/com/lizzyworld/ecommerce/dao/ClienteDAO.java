package br.com.lizzyworld.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.lizzyworld.ecommerce.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {

}
