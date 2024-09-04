package br.com.osmarcode.userapi.resource.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.osmarcode.userapi.domain.User;
import br.com.osmarcode.userapi.resource.UserResource;
import br.com.osmarcode.userapi.services.UserService;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController //controlador REST
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource{

	//injetando um UserService, injetando uma interface
	private final UserService service;
	
	
	@Override //tendo responseEntity não posso retornar service sozinho
	public ResponseEntity<User> findById(Long id) {
		return ResponseEntity.ok().body(service.findById(id));
	}

	@Override
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	

}
