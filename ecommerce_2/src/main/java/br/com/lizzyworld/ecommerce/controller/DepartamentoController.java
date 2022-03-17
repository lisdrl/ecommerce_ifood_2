package br.com.lizzyworld.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lizzyworld.ecommerce.dao.DepartamentoDAO;
import br.com.lizzyworld.ecommerce.model.Departamento;

@RestController
public class DepartamentoController {
	@Autowired
	private DepartamentoDAO dao;
	
	@GetMapping("/departamentos")
	public List<Departamento> retornarTodos(){
		List<Departamento> lista;
		lista = (List<Departamento>)dao.findAll();
		return lista;
	}
	
}
