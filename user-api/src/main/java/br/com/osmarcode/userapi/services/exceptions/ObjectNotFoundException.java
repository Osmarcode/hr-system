package br.com.osmarcode.userapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	//construtor que recebe uma emnsagem de erro
	public ObjectNotFoundException(String message) {
		super(message);
	}
	

}
