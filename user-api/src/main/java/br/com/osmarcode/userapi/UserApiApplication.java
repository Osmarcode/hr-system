package br.com.osmarcode.userapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.osmarcode.userapi.domain.User;
import br.com.osmarcode.userapi.repositories.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner{

	//a anotação Repository permite que injetemos instancias de user repository
	//em partes diferentes do nosso código
	//injetei uma instancia de userRepository para 
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	//a classe CommandLineRunner implementa o método run
	//toda vez que minha aplicação estartar vai chamar o userRepository
	// e salvar uma lista de objetos
	//id = null porque o banco que gera o ID
	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "Osmar Siqueira", "osmar@gmail.com", "123", 20.0),
				new User(null, "Osmar Siqueira", "osmar@gmail.com", "123", 40.0)
				));
		
	}

}
