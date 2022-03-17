package br.com.lizzyworld.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.lizzyworld.ecommerce.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {
	//	
}
