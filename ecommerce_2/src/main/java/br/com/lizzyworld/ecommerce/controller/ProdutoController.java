package br.com.lizzyworld.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lizzyworld.ecommerce.dao.ProdutoDAO;
import br.com.lizzyworld.ecommerce.model.Produto;

@RestController
public class ProdutoController {
	
	// Permite acessarmos os métodos da CrudRepository e da própria DAO:
	@Autowired
	private ProdutoDAO dao; 
	
	@GetMapping("/produtos")
	public List<Produto> recuperarTodos(){
		List<Produto> lista;
		lista = (List<Produto>)dao.findAll();
		return lista;
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> consultarProduto(@PathVariable Integer id){
		Produto res = dao.findById(id).orElse(null);
		if (res != null) {
			return ResponseEntity.ok(res);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/produtos/busca")
	public List<Produto> buscarPorPalavraChave(@RequestParam(name = "key") String palavra){
		List<Produto> lista;
		lista = (List<Produto>)dao.findByNomeCointainingOrDescricaoContaining(palavra, palavra);
		return lista;
	}
	
	
//	@GetMapping("/produtos/busca")
//	public ResponseEntity<Produto> buscarPorPalavra(@RequestParam(name = "key") String palavra){
//		System.out.println("Buscando");
//		return null;
//	}
	
	
}




