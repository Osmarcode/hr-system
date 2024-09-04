package br.com.osmarcode.userapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY; //isso tonar menos verboso ainda
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import static lombok.EqualsAndHashCode.Include; //torna menos verboso ainda
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "TB_USER")
public class User {
	
	
	@Include //com isso o equalsAndHashCode vai verificar apenas o ID
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	private Double hourlyPrice;
	

}
