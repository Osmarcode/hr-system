package br.com.osmarcode.userapi.resources.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class StandardError {
	
	private LocalDateTime timeStamp;
	private String error;
	private Integer status;
	private String path; //caminho onde ocorreu o erro

}
