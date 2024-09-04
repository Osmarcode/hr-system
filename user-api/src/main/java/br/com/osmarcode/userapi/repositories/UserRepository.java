package br.com.osmarcode.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.osmarcode.userapi.domain.User;

@Repository //aqui ele espera uma Entidade, tipo primitivo do nosso identificador
public interface UserRepository extends JpaRepository<User, Long>{

}
