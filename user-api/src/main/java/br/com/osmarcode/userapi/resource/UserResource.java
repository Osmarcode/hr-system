package br.com.osmarcode.userapi.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.osmarcode.userapi.domain.User;

public interface UserResource {
	
	//retorna um responseEntity, definindo um contrato
	@GetMapping(value = "/{id}") //como estou trabalhando com Path, então retorno um PathVariable
	ResponseEntity<User> findById(@PathVariable Long id);
	
	
	//definindo um contrato para listar todos os usuários
	@GetMapping //quando criamos um getMapping sem passar nada na url, sabemos que é o método que estamos tenando acessar
	ResponseEntity<List<User>> findAll();
}
