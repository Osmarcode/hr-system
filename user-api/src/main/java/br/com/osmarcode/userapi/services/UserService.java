package br.com.osmarcode.userapi.services;

import java.util.List;

import br.com.osmarcode.userapi.domain.User;

public interface UserService {
	
	//método que retorna um User pelo ID
	User findById(Long id);
	
	//retorna uma Lista de User
	List<User> findAll();

}
