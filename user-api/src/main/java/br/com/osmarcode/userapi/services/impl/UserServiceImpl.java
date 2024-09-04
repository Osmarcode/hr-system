package br.com.osmarcode.userapi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.osmarcode.userapi.domain.User;
import br.com.osmarcode.userapi.repositories.UserRepository;
import br.com.osmarcode.userapi.services.UserService;
import br.com.osmarcode.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired //injetando um userRepository, esse faz a ocmunicação com o banco
	private final UserRepository repository;

	
	@Override //por ser um Optionla o id, ficou com esse orElseThrow lançando uma exceção
	public User findById(Long id) {
	return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object Not Found"));
	}

	@Override
	public List<User> findAll() {
	return repository.findAll();
	}
}
