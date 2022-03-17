package br.com.lizzyworld.ecommerce.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lizzyworld.ecommerce.dao.PedidoDAO;
import br.com.lizzyworld.ecommerce.model.Pedido;

@RestController
public class PedidoController {
	@Autowired
	private PedidoDAO dao;
	
	@GetMapping("/pedidos")
	public List<Pedido> retornarTodos() {
		List<Pedido> lista;
		lista = (List<Pedido>)dao.findAll();
		return lista;
	}
}
