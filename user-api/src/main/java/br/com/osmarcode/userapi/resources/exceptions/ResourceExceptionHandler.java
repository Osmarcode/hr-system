package br.com.osmarcode.userapi.resources.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.osmarcode.userapi.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice //controlador de exceptions
public class ResourceExceptionHandler {
	//manipulador de exceptions do nosso recurso(resource)
	//sempre que for lançada uma exceção ela será capturada e tratada
	@ExceptionHandler(ObjectNotFoundException.class) //vai tratar a exceptio do tipo
	
	//pegando o path onde aconteceu a exceção 
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
				new StandardError(
						LocalDateTime.now(), 
						ex.getMessage(), //mensagem criada da Classe ObjectNotFoundException
						HttpStatus.NOT_FOUND.value(), //retorno deo NOT_FOND
						request.getRequestURI())// URL onde aconteceu a exception
				
				////////////////////////////////////////////////
				/* esse será o retorno para Object NOT FOUND
					* {
				    "timeStamp": "2024-09-04T07:04:27.604507",
				    "error": "Object Not Found",
				    "status": 404,
				    "path": "/api/users/3"
					}
				 * 
				 *
				 */
				/////////////////////////////////////////////////////
				//SERÃO PUXADOS NA SEQUÊNCIA OS ATRIBUTOS DA CLASSE STANDARD ERROR
				/*  private LocalDateTime timeStamp;
					private String error;
					private Integer status;
					private String path; //caminho onde ocorreu o erro
				 * 
				 * 
				 */
				
				);
	}

}
